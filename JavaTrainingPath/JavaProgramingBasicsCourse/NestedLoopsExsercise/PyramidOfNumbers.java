package JavaProgramingBasicsCourse.NestedLoopsExsercise;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());



        int currentNumber = 1;
        boolean isBigger = false;

        for (int r = 1; r <= n ; r++) {


            for (int c = 1; c <= r ; c++) {

                if(currentNumber > n){

                    isBigger = true;
                    break;
                }
                System.out.printf("%d ", currentNumber);
                currentNumber ++;

            }

            if (isBigger){
                  break;
            }
            System.out.println();
        }




    }
}
