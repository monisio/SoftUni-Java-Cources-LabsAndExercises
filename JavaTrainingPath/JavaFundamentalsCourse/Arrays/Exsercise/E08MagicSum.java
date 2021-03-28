package JavaFundamentalsCourse.Arrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element->Integer.parseInt(element)).toArray();

        int sum= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numbers.length ; i++) {


            for (int j = i+1; j <numbers.length ; j++) {


                int elementsSum = numbers[i] + numbers[j];

                if (elementsSum==sum){
                    System.out.println(numbers[i] +" "+ numbers[j]);
                }

            }
        }


    }
}
