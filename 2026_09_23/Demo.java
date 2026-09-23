public class Demo {
    
    public static void main(String[] args) {
        
        MyArrayList<Integer> nums = new MyArrayList<>();
        MyArrayList<String> names = new MyArrayList<>(100);

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(90);
        nums.add(100);
        System.out.println(nums.getCapacity());
        nums.add(110);
        System.out.println(nums.getCapacity());

        System.out.println("Printing the list");
        nums.print();
    }
}
