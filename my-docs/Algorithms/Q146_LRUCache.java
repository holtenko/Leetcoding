import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q146_LRUCache {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(3);
        obj.put(1, 1);
        int param_1 = obj.get(1);
    }

    static class DoubleListNode {
        public int key;
        public int value;
        public DoubleListNode pre;
        public DoubleListNode next;

        public DoubleListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class LRUCache {
        private int capacity;
        private int count;
        private DoubleListNode preHead;
        private DoubleListNode nextTail;
        private Map<Integer, DoubleListNode> cache;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.count = 0;
            this.preHead = new DoubleListNode(0, 0);
            this.nextTail = new DoubleListNode(0, 0);
            this.preHead.next = this.nextTail;
            this.nextTail.pre = this.preHead;
            this.cache = new HashMap<>(capacity);
        }

        public int get(int key) {
            if (!cache.containsKey(key)) {
                return -1;
            }
            DoubleListNode node = cache.get(key);
            deleteCur(node);
            addHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                DoubleListNode node = cache.get(key);
                node.value = value;
                deleteCur(node);
                addHead(node);
            } else {
                DoubleListNode node = new DoubleListNode(key, value);
                if (count >= capacity) {
                    deleteTail();
                    addHead(node);
                } else {
                    addHead(node);
                    count++;
                }
            }
        }

        private void deleteCur(DoubleListNode node) {
            DoubleListNode pre = node.pre;
            DoubleListNode next = node.next;
            pre.next = next;
            next.pre = pre;
            cache.remove(node.key);
        }

        private void addHead(DoubleListNode node) {
            DoubleListNode head = preHead.next;
            preHead.next = node;
            node.pre = preHead;
            node.next = head;
            head.pre = node;
            cache.put(node.key, node);
        }

        private void deleteTail() {
            DoubleListNode tail = nextTail.pre;
            cache.remove(tail.key);
            tail.pre.next = nextTail;
            nextTail.pre = tail.pre;
        }
    }
}