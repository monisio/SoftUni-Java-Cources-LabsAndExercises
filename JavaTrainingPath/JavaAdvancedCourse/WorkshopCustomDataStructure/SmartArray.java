package JavaAdvancedCourse.WorkshopCustomDataStructure;

import java.util.function.Consumer;

public class SmartArray {

    private static final int INITIAL_CAPACITY = 8;


    private int[] elements;
    private int size;
    private int capacity;

    public SmartArray() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;

    }

    public int get(int index) {
        validateIndex(index);
        return this.elements[index];

    }

    public void add(int element) {
        resize();
        this.elements[size] = element;
        this.size++;


    }


    public void add(int element , int index){
        validateIndex(index);
        resize();

        for (int i = this.size ; i > index ; i--) {
            this.elements[i] = this.elements[i-1];

        }

        this.elements[index] = element;
        this.size++;

    }

    public void remove(int index) {
        validateIndex(index);

        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.size - 1] = 0;
        this.size--;

        shrink();

    }

    public boolean contains(int element){
        for (int i = 0; i < size ; i++) {
            if (this.elements[i]==element){
                return true;
            }
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < this.size ; i++) {
             consumer.accept(this.elements[i]);
        }

    }


    private void validateIndex(int index) {
        if (!(index >= 0 && index < this.size)) {
            throw new IllegalStateException("index " + index + " of bound for size " + (this.size - 1));
        }

    }

    private void resize() {
        if (this.size == this.capacity - 1) {
            this.capacity *= 2;
            int[] scale = new int[this.capacity];

            for (int i = 0; i <= this.size; i++) {
                scale[i] = this.elements[i];

            }
            this.elements = scale;
        }
    }

    private void shrink(){
        if (this.size < this.capacity/2 && this.capacity/2 >= INITIAL_CAPACITY ){
            this.capacity= this.capacity/2;
            int[] shrink  = new int[this.capacity];

            for (int i = 0; i < this.size; i++) {
                shrink[i]= this.elements[i];
            }

            this.elements= shrink;

        }

    }

}
