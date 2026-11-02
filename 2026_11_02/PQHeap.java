import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PQHeap<K, V> {

    List<Entry<K, V>> heap; 
    Comparator<K> cmp; 

   public PQHeap(Comparator<K> cmp) {
        heap = new ArrayList<>();
        this.cmp = cmp;
   }

   public void insert(K key, V value) {

    Entry<K, V> entry = new PQEntry<>(key, value);
    heap.add(entry);
    upHeap(heap.size() - 1);
   }

   private void upHeap(int j) {
     while (j > 0) {
        if (cmp.compare(heap.get(j).getKey(), heap.get(parent(j))) > 0) {
            break;
        }
        swap(j, parent(j));
     }
   }

   public int parent(int j) {
    return (j - 1) / 2;
   }

    
}
