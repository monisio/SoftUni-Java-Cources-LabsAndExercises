package JavaFundamentalsCourse.Methods.Excersice;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();


        double factorialA = getFactorial(numberA);
        double factorialB = getFactorial(numberB);


        System.out.printf("%.2f", makeDivision(factorialA, factorialB));

    }

    private static double makeDivision(double factorialA, double factorialB) {
        return factorialA / factorialB;

    }

    private static double getFactorial(int number) {
        double factorial = 1.0;

        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }

        return factorial;
    }


}
