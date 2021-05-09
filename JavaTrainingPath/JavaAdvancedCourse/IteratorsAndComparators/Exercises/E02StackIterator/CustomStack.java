package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E02StackIterator;

import java.util.Iterator;

public class CustomStack<T> implements Iterable<T> {

    private int size;
    private Node top;

    public CustomStack() {
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();

    }


    private class Node {
        T value;
        Node previous;

        public Node(T value) {
            this.value = value;
            this.previous = top;
        }
    }

    public void push(T value) {
        this.top = new Node(value);
        size++;
    }

    public T pop() {
        if (this.top == null) {
            throw new IllegalStateException("No elements");
        }

        T value = this.top.value;
        this.top = this.top.previous;
        this.size--;
        return value;

    }

    private class StackIterator implements Iterator<T> {
        private Node current = top;

        @Override
        public boolean hasNext() {

            return this.current != null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.previous;
            return value;
        }
    }
}
