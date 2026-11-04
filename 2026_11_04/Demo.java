import java.util.Comparator;

public class Demo {
    
    public static void main(String[] args) {
       // 100 50 70 20 140 180 120 10 30 60 80 90
        
        Comparator<Integer> cmp = (a,  b)  ->  a - b; // Lambda
          
  

        PQHeap<Integer, String> pqHeap = new PQHeap<>(cmp);
        pqHeap.insert(100, null);
        pqHeap.insert(50, null);
        pqHeap.insert(70, null);
        pqHeap.insert(20, null);
        pqHeap.insert(140, null);
        pqHeap.insert(180, null);
        pqHeap.insert(120, null);
        pqHeap.insert(10, null);
        pqHeap.insert(30, null);
        pqHeap.insert(60, null);
        pqHeap.insert(80, null);
        pqHeap.insert(90, null);

        pqHeap.display();
    }
}
