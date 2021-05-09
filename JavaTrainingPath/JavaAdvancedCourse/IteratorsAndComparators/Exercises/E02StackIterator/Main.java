package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E02StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomStack<Integer> testStack = new CustomStack<>();

        String[] input = scanner.nextLine().replaceFirst("Push ", "").split(",\\s");

        for (int i = 0; i < input.length; i++) {
            testStack.push(Integer.parseInt(input[i].trim()));

        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            if (command.contains("Push")) {
                int element = Integer.parseInt(command.replaceFirst("Push ", ""));
                testStack.push(element);

            } else {

                try {
                    testStack.pop();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

            command = scanner.nextLine();

        }

        for (Integer integer : testStack) {
            System.out.println(integer);
        }


        for (Integer integer : testStack) {
            System.out.println(integer);
        }
    }
}
