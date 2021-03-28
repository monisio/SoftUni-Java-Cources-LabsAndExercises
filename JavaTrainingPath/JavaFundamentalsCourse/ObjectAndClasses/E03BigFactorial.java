package JavaFundamentalsCourse.ObjectAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class E03BigFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        BigInteger factorial = new BigInteger("1");



        for (int i = 1; i <=n ; i++) {

            factorial= factorial.multiply(BigInteger.valueOf(i));
        }


        System.out.println(factorial);

    }

}
