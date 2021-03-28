package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E03BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();




        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        while (number != 0) {

            int current = number % 2;
            number /= 2;

            binaryNumber.push(current);
        }

        if (binaryNumber.isEmpty()){
            binaryNumber.push(0);
        }


        while (!binaryNumber.isEmpty()) {
            System.out.print(binaryNumber.pop());
        }


    }
}
