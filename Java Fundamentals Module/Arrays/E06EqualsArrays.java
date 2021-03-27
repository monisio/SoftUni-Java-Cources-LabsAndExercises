package Fundamentals.Arrays;

import java.util.Scanner;

public class E06EqualsArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        String[] inputToArrayA = inputA.split(" ");
        String[] inputToArrayB = inputB.split(" ");

        int[] numbersA = new int[inputToArrayA.length];
        int[] numbersB = new int[inputToArrayB.length];


        for (int i = 0; i < numbersA.length; i++) {
            numbersA[i] = Integer.parseInt(inputToArrayA[i]);

        }

        for (int i = 0; i < numbersB.length; i++) {
            numbersB[i] = Integer.parseInt(inputToArrayB[i]);

        }

        int sum = 0;
        boolean isNotEqual = false;
        int indexThatDiffer = 0;
        for (int i = 0; i < numbersA.length; i++) {
            int a = numbersA[i];
            int b = numbersB[i];

            if (a == b) {
                sum += a;
            } else {
                isNotEqual = true;
                indexThatDiffer = i;
                break;
            }

        }


        String output = "";
        if (!isNotEqual) {
            output = String.format("Arrays are identical. Sum: %d", sum);

        } else {
            output = String.format("Arrays are not identical. Found difference at %d index.", indexThatDiffer);
        }

        System.out.println(output);

    }
}
