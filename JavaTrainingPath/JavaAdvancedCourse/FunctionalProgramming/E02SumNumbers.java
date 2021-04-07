package JavaAdvancedCourse.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E02SumNumbers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> parse =Integer::parseInt;

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(parse).collect(Collectors.toList());

        System.out.println("Count = " +numbers.stream().count());
        int sum = numbers.stream().mapToInt(n->n).sum();
        System.out.println("Sum = "+sum);

    }
}
