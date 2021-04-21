package JavaAdvancedCourse.WorkshopCustomDataStructure;

public class SmartArray {
    private int[] elements;
    private int size;
    private int capacity;

    public SmartArray() {
        this.elements = new int[8];
        this.size = 0;
        this.capacity = 8;

    }

    public void add(int element) {
        if(this.size == this.capacity-1){
            this.capacity*=2;
            int[]scale = new int[this.capacity];

            for (int i = 0; i <= this.size ; i++) {
                scale[i] = this.elements[i];

            }
            this.elements = scale;
        }
        this.elements[size] = element;
        this.size++;


    }


}
