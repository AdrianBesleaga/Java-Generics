    package generics;

    public class Main {

    public static void main(String[] args) throws Exception {
    // Create a queue of integers of size 10
    Fifo<Integer> q = new Fifo<Integer>(4);
    // Insert a number
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.list();
    q.dequeue();
    System.out.println(" ");
    q.list();



    // Stack

    int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

    Stack<Integer> integerStack = new Stack<Integer>(integerElements.length);



        System.out.println("\nPushing elements");

        for(int element : integerElements) {
            System.out.printf("%d ", element);
            integerStack.push(element);
        }

        System.out.println("\nPopping element");

        System.out.println(integerStack.pop());

        System.out.println("Get elements ");

        integerStack.get();

        integerStack.pop();

        integerStack.get();

    }
    }
