package JavaProgramingBasicsCourse.NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;

        boolean flag = false;

        for (int x = start; x <= end; x++) {


            for (int y = start; y <= end; y++) {

                count++;

                if (x + y == magicNumber) {

                    System.out.printf("Combination N:%d (%d + %d = %d)", count, x, y, magicNumber);
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }


        }

        if(!flag){
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);

        }

    }


}

