import java.util.ArrayList;

public class Demo {

    public <T> void print(T x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

    //  Demo d = new Demo();
    //  Integer x = 10;
    //     d.print(x);
    //     d.print(10.25);

    Fingerprint f = new Fingerprint(101);
    Student<Fingerprint> s1 = new Student<>("Bob", f);
    Student<Double> s2 = new Student<>("Bob", 101.1);

    ArrayList<Integer> arrs = new ArrayList<>();
        
    }
}