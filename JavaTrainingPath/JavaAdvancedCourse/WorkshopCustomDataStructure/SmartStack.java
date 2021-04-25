package JavaAdvancedCourse.WorkshopCustomDataStructure;

public class SmartStack {

    private int size;
    private Node top;

    private static class Node {
        int value;
        Node prev;


        private Node(int value, Node top) {
            this.value = value;
            this.prev = top;
        }


    }

    public SmartStack() {
    }

    public SmartStack(int element) {

        this.size++;
        this.top = new Node(element, this.top);

    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.top = new Node(element, this.top);
        size++;
    }

    public int pop() {
        checkIfEmpty();
        int element = this.top.value;
        this.top = this.top.prev;
        size--;
        return element;


    }

    public int peek() {
        checkIfEmpty();
        return this.top.value;

    }

    public int[] toArray(){
        checkIfEmpty();
        int currentSize= this.size;
        int[] array = new int[currentSize];
        for (int i = 0; i < currentSize; i++) {
           array[i] = this.pop();
        }
        return array;
    }

    private void checkIfEmpty() {
        if (isEmpty()) {
            throw new IllegalStateException("No elements");
        }
    }

}
