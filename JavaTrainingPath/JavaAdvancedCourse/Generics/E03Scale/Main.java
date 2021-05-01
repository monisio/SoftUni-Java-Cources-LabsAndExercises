package JavaAdvancedCourse.Generics.E03Scale;

public class Main {
    public static void main(String[] args) {


        Scale<Integer> scale = new Scale<>(3, 23);


        System.out.println(scale.getHeavier());
    }
}
