package JavaAdvancedCourse.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        // 2nd way of filtering even numbers -> input.removeIf(n-> n % 2 != 0) (example usage og Predicate lambda)
        // 2nd way of sorting -> input.sort(Integer::compareTo)

        System.out.println(input.toString().replaceAll("[\\[\\]]", ""));

        Collections.sort(input);

        System.out.print(input.toString().replaceAll("[\\[\\]]", ""));


    }
}
