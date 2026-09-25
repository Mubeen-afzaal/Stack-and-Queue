public class Homework_3 {

    static int[] stack = new int[5];
    static int stackSize = 0;

    static int[] queue = new int[5];
    static int queueSize = 0;

    public static void main(String[] args) {

        // --------------------
        // Stack
        // --------------------

        IO.println("");
        IO.println("STACK DEMONSTRATION");
        IO.println("Adding: ");

        push(15);
        push(25);
        push(35);
        push(45);
        push(55);

        IO.println("Top item: ");
        IO.println(peekStack()); //55

        IO.println("Removing: ");
        IO.println(pop()); //55

        IO.println("removing: ");
        IO.println(pop()); //45

        IO.println("New top: ");
        IO.println(peekStack()); //35

        IO.println("Is Stack Empty? ");
        IO.println(isStackEmpty()); //false

        // --------------------
        // Queue
        // --------------------

        IO.println("");
        IO.println("QUEUE DEMONSTRATION");
        IO.println("Adding:");

        enqueue(15);
        enqueue(25);
        enqueue(35);
        enqueue(45);
        enqueue(55);

        IO.println("");
        IO.println("Front item:");
        IO.println(peekQueue()); //15

        IO.println("Removing:");
        IO.println(dequeue()); //15

        IO.println("Removing:");
        IO.println(dequeue()); //25

        IO.println("New front:");
        IO.println(peekQueue()); //35

        IO.println("Is Queue empty?");
        IO.println(isQueueEmpty()); //false
    }


    // --------------------
    // Stack
    // --------------------

    public static void push(int value) {
        stack[stackSize] = value;
        stackSize++;

        IO.println(value);
    }

    public static int pop() {
        stackSize--;
        return stack[stackSize];
    }

    public static int peekStack() {
        return stack[stackSize - 1];
    }

    public static boolean isStackEmpty() {
        return stackSize == 0;
    }


    // --------------------
    // Queue
    // --------------------

    public static void enqueue(int value) {
        queue[queueSize] = value;
        queueSize++;

        IO.println(value);
    }

    public static int dequeue() {
        int removed = queue[0];

        for (int i = 0; i < queueSize - 1; i++) {
            queue[i] = queue[i + 1];
        }

        queueSize--;

        return removed;
    }

    public static int peekQueue() {
        return queue[0];
    }

    public static boolean isQueueEmpty() {
        return queueSize == 0;
    }
}