package Checks;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double operationResult = 0.0;
        int operationResultDiv = 0;

        double n11 = n1 * 1.0;
        double n22 = n2 * 1.0;

        if (operator.equals("+")) {
            operationResultDiv = n1 + n2;

        } else if (operator.equals("-")) {
            operationResultDiv = n1 - n2;

        } else if (operator.equals("*")) {
            operationResultDiv = n1 * n2;

        } else if (operator.equals("/")) {
            operationResult = n11 / n22 ;

        } else if (operator.equals("%")&& n2!=0) {
            operationResultDiv = n1 % n2;

        }

        String evenOdd = "";


        if (operationResultDiv % 2 == 0) {
            evenOdd = "even";
        } else {
            evenOdd = "odd";
        }



        if (n2 == 0 && operator.equals("/")|| n2 == 0 && operator.equals("%") ) {
            System.out.printf("Cannot divide %d by zero", n1);

        } else if (operator.equals("/")) {
            System.out.printf("%d / %d = %.2f", n1, n2, operationResult);

        }


        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %d - %s", n1, operator, n2, operationResultDiv, evenOdd);
        } else if (n2 != 0 && operator.equals("%")) {
            System.out.printf("%d %% %d = %d", n1, n2, operationResultDiv);

        }


    }
}
