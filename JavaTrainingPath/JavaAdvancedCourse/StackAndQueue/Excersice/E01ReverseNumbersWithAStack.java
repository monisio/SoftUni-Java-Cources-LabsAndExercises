package JavaAdvancedCourse.StackAndQueue.Excersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(numbers::push);

        while (!numbers.isEmpty()) {

            System.out.print(numbers.pop() + " ");
        }

    }
}
