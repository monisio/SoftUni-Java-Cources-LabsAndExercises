package JavaAdvancedCourse.Generics.E02ArrayCreator;

public class Main {
    public static void main(String[] args) {


     Integer[] array = ArrayCreator.<Integer>createArray(10 , 12);
     Integer[] array1 = ArrayCreator.<Integer>createArray( Integer.class,10 , 12);


    }




}
