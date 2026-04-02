import java.util.*;
class CustomHashMap<K, V> {
    private LinkedList<Node<K, V>>[] bucket;
    private int size;

    static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public CustomHashMap(int n) {
        bucket = new LinkedList[n];
        for (int i = 0; i < n; i++)
            bucket[i] = new LinkedList<>();
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % bucket.length;
    }

    public void put(K key, V value) {
        int idx = hash(key);
        for (Node<K, V> node : bucket[idx]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket[idx].add(new Node<>(key, value));
        size++;
    }

    public V get(K key) {
        int idx = hash(key);
        for (Node<K, V> node : bucket[idx]) {
            if (node.key.equals(key))
                return node.value;
        }
        return null;
    }

    public void remove(K key) {
        int idx = hash(key);
        bucket[idx].removeIf(node -> node.key.equals(key));
    }
}
