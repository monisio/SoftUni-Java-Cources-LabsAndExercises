package JavaFundamentalsCourse.Arrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



        for (int i = 0; i < numbers.length; i++) {
            boolean isTopInteger = true;
            int num = numbers[i];

            for (int j = i+1; j < numbers.length; j++) {


                if(num<=numbers[j] ){
                   isTopInteger= false;
                   break;
                }


            }


            if (isTopInteger){
                System.out.print(num+" ");
            }

        }

    }
}
