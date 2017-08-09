package generics;

public class Fifo<T> {

    private Object[] queue;       // The underlying array
    private int size;             // The maximal capacity
    private int head      = 0;    // Pointer to head of queue
    private int tail      = 0;    // Pointer to tail of queue
    private boolean empty = true; // Whether the queue is empty or not


    public Fifo(int size) {
        this.queue = new Object[size];
        this.size  = size;
    }

    public void enqueue(T elem) throws Exception {
        // Check if the queue is full and throw exception
        if (head + 1 == size) {
            throw new Exception("Cannot enqueue " + elem);
        }

        // The queue has space left, enqueue the item
        queue[tail++] = elem;
        empty       = false;
    }

    public T dequeue() throws Exception {
        // Check if queue is empty and throw exception
        if (empty) {
            throw new Exception("The queue is empty");
        }

        // The queue is not empty, return element
        T elem = (T) queue[head++];
        empty  = (head == tail);
        return elem;
    }

    public void list() {
        for(int counter=head;counter<tail;counter++){
            System.out.print(queue[counter] + " ");
        }
    }

}
