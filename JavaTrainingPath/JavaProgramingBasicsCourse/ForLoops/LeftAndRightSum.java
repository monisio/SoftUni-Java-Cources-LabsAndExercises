package JavaProgramingBasicsCourse.ForLoops;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        int sumRight = 0;
        int sumLeft = 0;

        for ( int i = 1 ; i <=N ; i ++ ){
            int n = Integer.parseInt(scanner.nextLine());
            sumLeft += n;

        }

        for ( int i = 1 ; i <=N ; i ++ ){
            int n = Integer.parseInt(scanner.nextLine());
            sumRight += n;
        }


        int calc = sumLeft-sumRight;

        if (sumLeft == sumRight){
            System.out.printf("Yes, sum = %d", sumLeft );
        }else {
            System.out.printf("No, diff = %d",Math.abs(calc) );


        }






    }
}
