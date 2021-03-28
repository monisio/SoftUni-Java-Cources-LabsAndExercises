package JavaFundamentalsCourse.Arrays.Exsercise;

import java.util.Scanner;

public class E06EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int [] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element->Integer.parseInt(element)).toArray();
        String [] input = scanner.nextLine().split(" ");

        int [] numbers = new int [input.length];

        for (int i = 0; i < input.length; i++) {

            numbers[i] = Integer.parseInt(input[i]);
        }


        boolean isExist = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            int sumLeft = 0;
            int sumRight = 0;

            for (int left = i-1 ; left >=0 ; left--) {
                sumLeft += numbers[left];
            }

            for (int right = i+1; right < numbers.length ; right++) {
                sumRight += numbers[right];
            }

             if (sumLeft == sumRight) {
                 isExist=true;
                 System.out.print(i);
             }


        }


        if(!isExist){
            System.out.print("no");
        }

    }
}
