package JavaFundamentalsCourse.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class E07CondenceNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();


        int [] condensed = new int [numbers.length-1];

        while (numbers.length>1){

            if (numbers.length > 2){

                for (int i = 0; i < condensed.length; i++) {
                    condensed[i]= numbers[i]+numbers[i+1];

                }
            }else{

                condensed [0] = numbers[0] + numbers[1];
                break;
            }

            numbers = condensed;
        }

        System.out.println(numbers[0]);

        //5 0 4 1 2

    }
}
