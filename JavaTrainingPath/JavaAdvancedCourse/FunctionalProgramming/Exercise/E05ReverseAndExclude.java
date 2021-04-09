package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(input);

        Predicate<Integer> ifDivisible = num-> num % n != 0;

        System.out.println(input.stream().filter(ifDivisible).map(String::valueOf).collect(Collectors.joining(" ")));


    }
}
