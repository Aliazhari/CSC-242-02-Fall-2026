public class PQEntry<K, V> implements Entry<K, V> {

    private V value;
    private K key;

    public PQEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public K getKey() {
        return key;
    }

}
