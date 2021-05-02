package JavaAdvancedCourse.Generics.E05GenericBox;

public class Box<T extends Comparable<T>> implements Comparable<T> {

   private T contain;

    public Box(T element){
        this.contain= element;
    }

    public T getContain() {
        return this.contain;
    }

    public void setContain(T contain) {
        this.contain = contain;
    }

    @Override
    public String toString() {
        return contain.getClass().getName() + ": "+ this.contain;
    }


    @Override
    public int compareTo(T o) {
        return this.contain.compareTo(o);
    }
}
