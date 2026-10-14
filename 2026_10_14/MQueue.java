import java.util.Iterator;

public class MQueue<E> implements QueueInterface <E>, Iterable<E>{

    private Node<E> first;
    private Node<E> last;
    int size;

    

    public MQueue() {
        first = last = null;
        size = 0;

    }

    @Override
    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);

        if (isEmpty())
              first = last = newNode;
        else
        {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
   
    }

    @Override
    public E dequeue() {

        if (isEmpty())
            return null;

        Node<E> temp = first;
        if (first == last) {
            first = last = null;
        }
        else {
        first = first.getNext();
        temp.setNext(null);
        }
        size--;

        return temp.getData();
     
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
     }

    @Override
    public int size() {
    return size;
 }


    @Override
    public Iterator<E> iterator() {
         return new Iterator<>() {
             Node<E> cursor = first;

    @Override
    public boolean hasNext() {
         return cursor != null;
       
    }

    @Override
    public E next() {

        Node<E> temp  = cursor;
        cursor = cursor.getNext();
        return temp.getData();
      }

         };
 }
    
}
