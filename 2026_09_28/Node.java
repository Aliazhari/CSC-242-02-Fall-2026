public class Node <T>{

    private T data;
    private Node<T> next;


    public Node(T data) {
        this.data = data;
        next = null;
    }

    public T getdata() {
        return data;
    }

    public void setdata(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    
}
