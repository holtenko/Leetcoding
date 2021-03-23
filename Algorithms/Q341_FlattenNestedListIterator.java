import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q341_FlattenNestedListIterator {
    public static void main(String[] args) {
        NestedInteger nestedInteger1 = new NestedInteger(1);
        NestedInteger nestedInteger2 = new NestedInteger(2);
        List<NestedInteger> nestedIntegerList1 = new ArrayList<>();
        nestedIntegerList1.add(nestedInteger1);
        nestedIntegerList1.add(nestedInteger2);
        NestedInteger nestedInteger4 = new NestedInteger(4);
        NestedInteger nestedInteger5 = new NestedInteger(5);
        List<NestedInteger> nestedIntegerList2 = new ArrayList<>();
        nestedIntegerList2.add(nestedInteger4);
        nestedIntegerList2.add(nestedInteger5);

        NestedInteger n1 = new NestedInteger(nestedIntegerList1);
        NestedInteger n2 = new NestedInteger(3);
        NestedInteger n3 = new NestedInteger(nestedIntegerList2);

        List<NestedInteger> nestedIntegerList = new ArrayList<>();
        nestedIntegerList.add(n1);
        nestedIntegerList.add(n2);
        nestedIntegerList.add(n3);

        NestedIterator nestedIterator = new NestedIterator(nestedIntegerList);
    }

    static class NestedInteger {
        Integer integer;
        List<NestedInteger> nestedIntegerList;

        public NestedInteger(Integer integer) {
            this.integer = integer;
        }

        public NestedInteger(List<NestedInteger> nestedIntegerList) {
            this.nestedIntegerList = nestedIntegerList;
        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger() {
            return integer != null;
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {
            return integer;
        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList() {
            return nestedIntegerList;
        }
    }

    static class NestedIterator implements Iterator<Integer> {
        private List<Integer> integerList;
        private int curIdx;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.integerList = new ArrayList<>();
            this.curIdx = 0;
            for (int i = 0; i < nestedList.size(); i++) {
                NestedInteger nestedInteger = nestedList.get(i);
                flatten(nestedInteger, integerList);
            }
        }

        private void flatten(NestedInteger nestedInteger, List<Integer> integerList) {
            if (nestedInteger.isInteger()) {
                integerList.add(nestedInteger.getInteger());
            } else {
                List<NestedInteger> nestedIntegerList = nestedInteger.getList();
                for (int i = 0; i < nestedIntegerList.size(); i++) {
                    NestedInteger listElement = nestedIntegerList.get(i);
                    flatten(listElement, integerList);
                }
            }
        }

        @Override
        public Integer next() {
            return integerList.get(curIdx++);
        }

        @Override
        public boolean hasNext() {
            if (integerList.isEmpty()) {
                return false;
            }
            return curIdx < integerList.size();
        }
    }
}