public class MyStack <T> {
    
    private int capacity;
    private T[] elements;
    private int top;

    public MyStack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T e) {
       if (isFull())
          return;
        elements[++top]= e;
    }

    public T pop() {

        if (isEmpty())
              return null;
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void print() {
        for(int i = 0; i < top + 1; i++)
            System.out.println(elements[i]);
    }

}
