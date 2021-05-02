package JavaAdvancedCourse.Generics.E05GenericBox;

public class Box<T> {

   private T contain;

    public Box(T element){
        this.contain= element;
    }

    public T getContain() {
        return contain;
    }

    public void setContain(T contain) {
        this.contain = contain;
    }

    @Override
    public String toString() {
        return contain.getClass().getName() + ": "+ this.contain;
    }
}
