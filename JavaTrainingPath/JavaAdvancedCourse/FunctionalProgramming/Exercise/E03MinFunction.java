package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class E03MinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<int[] ,Integer> findMinFunction = arr->{
         return   Arrays.stream(arr).min().getAsInt();
        };

     int [] array = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

     int result = findMinFunction.apply(array);

        System.out.println(result);

    }
}
