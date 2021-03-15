import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author holten
 * @date 2021/3/14
 */
class Q706_DesignHashMap {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        myHashMap.put(3, 3);
        myHashMap.put(2, 3);
        myHashMap.put(769 + 3, 5);
        myHashMap.put(769 * 2 + 3, 6);
        myHashMap.remove(769 * 2 + 3);
        myHashMap.remove(3);
    }

    static class MyHashMap {
        static class Pair {
            public int key;
            public int value;

            public Pair(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final static int BASE = 769;
        LinkedList<Pair>[] hashMap;


        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            hashMap = new LinkedList[BASE];
            for (int i = 0; i < BASE; ++i) {
                hashMap[i] = new LinkedList<Pair>();
            }
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            int index = hash(key);
            LinkedList<Pair> sameKeys = hashMap[index];
            Iterator<Pair> iterator = sameKeys.iterator();
            while (iterator.hasNext()) {
                Pair pair = iterator.next();
                if (pair.key == key) {
                    iterator.remove();
                    break;
                }
            }
            sameKeys.add(new Pair(key, value));
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            int index = hash(key);
            LinkedList<Pair> sameKeys = hashMap[index];
            for (Pair pair : sameKeys) {
                if (pair.key == key) {
                    return pair.value;
                }
            }
            return -1;
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            int index = hash(key);
            LinkedList<Pair> sameKeys = hashMap[index];
            Iterator<Pair> iterator = sameKeys.iterator();
            while (iterator.hasNext()) {
                Pair pair = iterator.next();
                if (pair.key == key) {
                    iterator.remove();
                    break;
                }
            }
        }

        private int hash(int key) {
            return key % 769;
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}