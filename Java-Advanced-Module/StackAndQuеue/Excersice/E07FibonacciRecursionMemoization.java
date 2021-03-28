package AdvancedJava.StackAndQuеue.Excersice;

import java.util.Scanner;

public class E07FibonacciRecursionMemoization {

    static long[] memory ;  // генериране на масив статик който е извън майн класа с цел мемоизация на резултата.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n  = Integer.parseInt(scanner.nextLine());

       memory   = new long [n+1]; // инициализираме масива в майн метода защото иначе не виждаме променливата n.

        long result = getFibonacci(n);


        System.out.println(result);
    }

    private static long getFibonacci(int n) {
        if(n<=1){
            return 1;
        }

        if (memory[n] != 0 ){
            return memory[n];
        }else{

            return memory[n]= getFibonacci(n-1)+ getFibonacci(n-2); // освен че връщаме стойността добавяме тази стойност в масива.
        }

    }
}
