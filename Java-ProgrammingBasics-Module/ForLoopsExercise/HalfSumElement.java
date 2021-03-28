package ForCyclesExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitsCount = Integer.parseInt (scanner.nextLine());

        int max = Integer.MIN_VALUE;

        int sum = 0 ;

        for (int i = 1 ; i <=digitsCount ; i++){

            int digitInput = Integer.parseInt(scanner.nextLine());

            sum += digitInput;

            if (digitInput > max ){
                max = digitInput;
            }

        }

        int sumWithoutMax = sum - max;

        if (max == sumWithoutMax){
            System.out.println("Yes");
            System.out.printf("Sum = %d",max);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(max- sumWithoutMax));
        }




    }
}
