class Student  <T> {

    private String name;
    private T id;

    @SuppressWarnings("unchecked")
    T innerFinger = (T)new Object();

    public Student(String name, T id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }

    public T getd() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }

    
    

     
    
}
