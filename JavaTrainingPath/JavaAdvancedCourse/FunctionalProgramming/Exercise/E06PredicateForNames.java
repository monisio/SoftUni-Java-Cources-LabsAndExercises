package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class E06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  length = Integer.parseInt(scanner.nextLine());

        Predicate<String> checkLength = str-> str.length() <= length;

        List<String> inputNames = Arrays.asList(scanner.nextLine().split("\\s"));

        inputNames.stream().filter(checkLength).forEach(System.out::println);


    }


}
