public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        head = tail = null;
    }

    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

}
