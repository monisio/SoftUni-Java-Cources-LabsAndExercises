package JavaProgramingBasicsCourse.ForLoops;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iteration = Integer.parseInt(scanner.nextLine());


        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1 ; i <= iteration ; i ++ ){
            if (i % 2 == 0  ){
                int even = Integer.parseInt(scanner.nextLine());
                sumEven += even;
            } else {
                int odd = Integer.parseInt(scanner.nextLine());
                sumOdd += odd;
            }


        }



        int calc = sumEven - sumOdd;

        if (sumEven == sumOdd){
            System.out.println("Yes");
            System.out.println("Sum = "+sumEven);
        }else {
            System.out.printf("No %nDiff = %d",Math.abs(calc) );


        }



    }
}
