package JavaAdvancedCourse.WorkshopCustomDataStructure;

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

    public void add(int element) {
        resize();
        this.elements[size] = element;
        this.size++;


    }

    public int get(int index) {
        validateIndex(index);
        return this.elements[index];

    }

    public void remove(int index) {
        validateIndex(index);

        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.size - 1] = 0;
        this.size--;
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


}
