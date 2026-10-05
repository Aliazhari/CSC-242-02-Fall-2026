import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void print(List<Integer> lst) {
        for (Integer i : lst) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
      
//         LinkedList<Integer> lst1 = new LinkedList<>();
//         lst1.add(12);
//         lst1.add(24);
//         lst1.add(36);

//         ArrayList<Integer> arrs = new ArrayList<>();
//         arrs.add(100);
//         arrs.add(200);
//         arrs.add(300);

// print(lst1);
// print(arrs);

MyStack<Integer> stack = new MyStack<>(4);
stack.push(2);
stack.push(4);
stack.pop();
stack.push(6);
stack.push(8);

stack.print();
    }
}