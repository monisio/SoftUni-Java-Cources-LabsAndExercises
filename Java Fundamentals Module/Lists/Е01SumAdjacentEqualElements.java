package Fundamentals.Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Е01SumAdjacentEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String[] inputAsArray = input.split(" ");

        List<Double> numbers = new ArrayList<>();

        for (String s : inputAsArray) {
            numbers.add(Double.parseDouble(s));

        }


        for (int i = 0; i < numbers.size() - 1; i++) {

            double numberA = numbers.get(i);
            double numberB = numbers.get(i + 1);

            if (numberA == numberB) {
                double currentSum = numberA + numberB;
                numbers.remove(i);
                numbers.set(i, currentSum);


                i=-1 ;

            }


        }


       String output = getDecimalIntoString(numbers);

        System.out.println(output);
    }

    private static String getDecimalIntoString(List<Double> numbers) {

        String output = "";


        for (int i = 0; i <numbers.size() ; i++) {
            output += new DecimalFormat("0.#").format(numbers.get(i))+" ";

        }

        return output;
    }


}
