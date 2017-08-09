package generics;

class Stack<E> {
    private int size;

    private int top;

    private E[] elements;

    public Stack() {
        this(10);
    }

    public Stack(int s) {
        size = s > 0 ? s : 10;
        top = -1;

       elements = (E[]) new Object[size]; // create array
    }

    public void push(E pushValue) {
        if (top == size - 1) // if stack is full
            System.out.println(String.format("Stack is full, cannot push %s", pushValue));

        elements[++top] = pushValue; // place pushValue on Stack
    }

    public E pop() {
        if (top == -1) { // if stack is empty
            System.out.println("Stack is empty, cannot pop");
        }

        return elements[top--]; // remove and return top element of Stack
    }

    public void get(){
        for(int counter=0; counter <= top ; counter++) {
            System.out.print(elements[counter] + " ");
        }
        System.out.println(" ");
    }
}



