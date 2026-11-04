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

   private void downHeap(int j){
     while (left(j) < heap.size()) {
 
      int smallest = left(j);

      if (right(j) > heap.size()-1)
        if (cmp.compare(heap.get(smallest).getKey(), heap.get(right(j)).getKey()) > 0)
        smallest = right(j);

      if (cmp.compare(heap.get(j).getKey(), heap.get(smallest).getKey()) < 0) {
        break;
      }
      swap(j, smallest);
      j = smallest;
     }
   }

   public K remove() {
    Entry<K, V> temp = heap.get(0);
    heap.set(0,heap.get(heap.size() - 1));
    heap.remove(heap.size() -1);
    downHeap(0);
    return temp.getKey();

   }

   private void swap(int i, int j) {
    Entry<K, V> e = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, e);
   }

   private void upHeap(int j) {
     while (j > 0) {
        if (cmp.compare(heap.get(j).getKey(), heap.get(parent(j)).getKey()) > 0) {
            break;
        }
        swap(j, parent(j));
        j = parent(j);
     }
   }

   public int parent(int j) {
    return (j - 1) / 2;
   }
   public int left(int j) {
       return (j * 2) + 1;
   }
   public int right(int j) {
       return (j * 2) + 2;
   }


   public void display() {
     for (Entry<K, V> e : heap) {
      System.out.println(e.getKey());
     }
   }
    
}
