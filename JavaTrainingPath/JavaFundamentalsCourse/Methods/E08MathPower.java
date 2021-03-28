package JavaFundamentalsCourse.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number =  scanner.nextDouble();
        double power = scanner.nextDouble();

        double result = calculateMathPower(number,power);
        System.out.println(new DecimalFormat("0.####").format(result) );

    }

    private static double calculateMathPower(double number, double power) {

        double result = number;

        for (int i = 1; i < power; i++) {

            result = result * number;

        }

        return result;
    }
}
