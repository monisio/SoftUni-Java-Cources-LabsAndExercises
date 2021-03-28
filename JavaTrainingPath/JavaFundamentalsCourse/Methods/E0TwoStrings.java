package JavaFundamentalsCourse.Methods;

import java.util.Scanner;

public class E0TwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        int repeatTimes = Integer.parseInt(scanner.nextLine());

        String output = multiplyInputString(inputString, repeatTimes);

        System.out.println(output);
    }


    private static String multiplyInputString(String input, int multiplier) {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= multiplier; i++) {
            output.append(input);

        }

        return output.toString();
    }
}
