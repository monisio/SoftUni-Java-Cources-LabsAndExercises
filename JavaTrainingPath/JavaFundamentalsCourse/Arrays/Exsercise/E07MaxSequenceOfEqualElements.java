package JavaFundamentalsCourse.Arrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();


        int numberElement = 0;
        int timesRepeated = 0;


        for (int i = 0; i < numbers.length; i++) {


            int currentElement= 0;
            int counter = 1;

            for (int j = i+1 ; j < numbers.length ; j++) {


                if (numbers[i] == numbers[j]){
                    currentElement = numbers[i];
                    counter++;
                }else {
                    break;
                }

            }

            if (counter > timesRepeated){
                numberElement = currentElement;
                timesRepeated= counter;
            }

        }

        for (int i = 0; i <timesRepeated ; i++) {

            System.out.print(numberElement+" ");
        }



    }
}
