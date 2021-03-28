package JavaFundamentalsCourse.Methods;

import java.util.Scanner;

public class E11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberA = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int numberB = Integer.parseInt(scanner.nextLine());


        System.out.printf ("%.0f", getResult( numberA,operator,numberB));



    }

    private static double getResult(int numberA, String operator, int numberB) {
            double result = 0.0;



            switch (operator){
                case "/":
                    result= getDivision(numberA,numberB);
                    break;
                case "*":
                    result= getMultiply(numberA,numberB);
                    break;

                case "+":
                    result= getAdd(numberA,numberB);
                    break;

                case "-":
                    result= getSubstract(numberA,numberB);
            }

            return Math.round(result);
    }

    private static double getSubstract(int numberA, int numberB) {
        return numberA-numberB;
    }

    private static double getAdd(int numberA, int numberB) {
        return numberA+numberB;
    }

    private static double getMultiply(int numberA, int numberB) {
        return numberA*numberB;
    }

    private static double getDivision(int numberA, int numberB) {
        return (double)numberA /numberB;
    }
}
