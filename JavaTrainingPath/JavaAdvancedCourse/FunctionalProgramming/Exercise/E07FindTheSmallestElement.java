package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Function<List<Integer>,Integer> findMinElementIndex = list->{

            int smallest = list.stream().mapToInt(e->e).min().getAsInt();
            return list.lastIndexOf(smallest);

        };

        System.out.println(findMinElementIndex.apply(inputNumbers));

    }
}
