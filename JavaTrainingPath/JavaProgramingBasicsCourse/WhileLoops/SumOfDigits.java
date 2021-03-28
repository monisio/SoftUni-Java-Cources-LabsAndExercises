package JavaProgramingBasicsCourse.WhileLoops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit =Integer.parseInt(scanner.nextLine());


        int sum = 0;
// dokato sumata e po malka ot digit - vurti loopa.
        while (sum < digit){
            int digitColumn = Integer.parseInt(scanner.nextLine());
            sum += digitColumn;

        }

        System.out.println(sum);

    }
}
