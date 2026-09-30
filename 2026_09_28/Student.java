/* ************************************************
 *  @Author : Ali Azhari   
 *  Created On : Sun Sep 27 2026
 *  @File : Student.java
 *  Description: Student class with 4 attributes
 **************************************************/

class Student {

    private int id;
    private String name;
    private int age;
    private double gpa;

// Overload Constructor
    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

// Accessors and Mutators
    public int getId() { return id;  }
    public void setId(int id) { this.id = id; }

    public String getName() {  return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() {  return age; }
    public void setAge(int age) { this.age = age; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa;  }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
    }

    
}