package Fundamentals.DataTypesAndVariables.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class DaDa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dnaLength = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int[] bestSample = new int[dnaLength];
        int sum = 0;
        int bestSequence = 0;
        int bestSampleNumber = 0;
        int index = 100;

        int sampleCount = 0;


        while (!input.equals("Clone them!")) {

            int[] sample = Arrays.stream(input.split("!+")).mapToInt(element -> Integer.parseInt(element)).toArray();

            int longestSequence = 0;
            int currentIndex = 100;
            int currentSum = 0;
            int currentCount = 0;
            sampleCount++;


            for (int i = sample.length - 1; i >= 0; i--) {


                if (sample[i] == 1) {
                    currentCount++;

                    if (currentCount > longestSequence) {
                        longestSequence = currentCount;
                        currentIndex = i;
                    }

                } else {
                    currentCount = 0;

                }
                currentSum += sample[i];
            }

            boolean isBestSample = false;


            if (longestSequence > bestSequence) {
                isBestSample = true;
            }
            if (longestSequence == bestSequence && currentIndex < index) {
                isBestSample = true;
            }
            if (longestSequence == bestSequence && currentIndex == index && currentSum > sum) {
                isBestSample = true;
            }

            if (isBestSample) {
                bestSample = sample;
                sum = currentSum;
                bestSequence = longestSequence;
                bestSampleNumber = sampleCount;
                index = currentIndex;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleNumber, sum);

        for (int i = 0; i < bestSample.length; i++) {
            System.out.print(bestSample[i] + " ");

        }


    }
}
