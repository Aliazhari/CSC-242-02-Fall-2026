class MyArrayList <E> {

    int capacity;
    int size;
    E[] elements;


   
    public MyArrayList() {
       this(10);

    }
    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        size = 0;
        elements = (E[]) new Object[capacity];

    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }

    @SuppressWarnings("unchecked")
    private void grow() {

        capacity *= 2;
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++)
             temp[i] = elements[i];

       elements = temp;
    }

    public void add(E element) {


        if (isFull())
            grow();

        elements[size++]= element;

    }

    public void print() {
        if (isEmpty())
             System.out.println("List is empty");
            else 
        for (int i = 0; i < size; i++)
            System.out.println(elements[i]);
    }

    public int getCapacity() {
        return capacity;
    }
}