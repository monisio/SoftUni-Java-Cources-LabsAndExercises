package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s");

        Consumer<String> sirAdd = srt-> System.out.println("Sir "+ srt);

        Arrays.stream(input).forEach(sirAdd);

    }
}
