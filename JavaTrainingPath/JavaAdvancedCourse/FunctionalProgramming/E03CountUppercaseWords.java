package JavaAdvancedCourse.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> upperCaseCheck = s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0));

        List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(upperCaseCheck).collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(System.out::println);

    }
}
