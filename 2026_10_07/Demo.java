public class Demo {
    
    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>(5);

        try {
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.pop();
   
        }
        catch (StackOverflowException ex) {
            System.out.println(ex.getMessage());
        }
       for (Integer e : s) {
        System.out.println(e);
       }



    }
}
