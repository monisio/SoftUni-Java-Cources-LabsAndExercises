package Fundamentals.ObjectAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class E02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();


        BigInteger sum = firstNumber.add(secondNumber);


        System.out.println(sum);


    }
}
