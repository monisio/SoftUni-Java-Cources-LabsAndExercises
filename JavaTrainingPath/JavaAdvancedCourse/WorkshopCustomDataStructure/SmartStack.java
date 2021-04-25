package JavaAdvancedCourse.WorkshopCustomDataStructure;

public class SmartStack {

    private int size;
    private Node top;

    public SmartStack(){
    }

    public SmartStack(int element) {

        this.size++;
        this.top = new Node(element, this.top);

    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty(){
       return size==0&&this.top==null;
    }

    public void push(int element) {
        this.top = new Node(element, this.top);
        size++;
    }

    public int pop() {
        if (!isEmpty()){
            int element = this.top.value;
            this.top = this.top.prev;
            size--;
            return element;

        }else {
            throw new IllegalStateException("No elements");
        }
    }

    public int peek() {
        if(!isEmpty()){
            return this.top.value;

        }else {
            throw new IllegalStateException("No elements");
        }
    }



    private static class Node {
        int value;
        Node prev;


        private Node(int value, Node top) {
            this.value = value;
            this.prev = top;
        }


    }

}
