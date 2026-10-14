public class Demo {
    

    public static void main(String[] args) {
        
        MQueue<Integer> q = new MQueue<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Dequeing: " + q.dequeue());
        q.enqueue(50);

        for (Integer i : q) {
            System.out.println(i);
        }
    }
}
