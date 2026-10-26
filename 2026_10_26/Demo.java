import java.util.Comparator;

public class Demo {
    
    public static void main(String[] args) {
        
        Student<Integer> s1 = new Student<>("Bob", 19, 101);
        Student<Integer> s2 = new Student<>("Bob", 19, 102);

        
        Comparator<Student<Integer>> cmp =  ( o1,  o2) -> {
                return o1.getId()- o2.getId();
            };


        int i = cmp.compare(s1, s2);
        if (i > 0) {
            System.out.println("S1 is > S2");
        }
        else if (i < 0)
            System.out.println("S1 < s2");
        else
            System.out.println("Equals");


        s1.addGrade(90);
        s1.addGrade(91);
        s1.addGrade(92);
        s1.addGrade(93);
        s1.addGrade(94);
        s1.addGrade(95);
        
        for (int g : s1) {
            System.out.println(g);

        }
    }
}
