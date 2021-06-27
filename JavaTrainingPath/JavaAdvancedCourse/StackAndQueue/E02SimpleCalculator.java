package JavaAdvancedCourse.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> calculator = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {

            if (Character.isDigit(input[i].charAt(0))) {
                calculator.push(Integer.parseInt(input[i]));

            } else {
                // prefix ++i is changing i so we must keep its original state in variable in order to check if its + ot - ;
                String operator = input[i];
                int leftOperator = calculator.pop();
                int rightOperator = Integer.parseInt(input[++i]);

                int resultingNumber = operator.equals("+") ? leftOperator + rightOperator : leftOperator - rightOperator;
                calculator.push(resultingNumber);
            }

        }


        System.out.println(calculator.pop());

    }
}
