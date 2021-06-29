package JavaOOPCourse.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class E02EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true){
           try{
               int start = Integer.parseInt(scanner.nextLine());
               int end = Integer.parseInt(scanner.nextLine());
               printNumbers(start, end);
               System.out.println("Success at execution");
               break;
           }catch (IllegalArgumentException exception){
               System.out.println(exception.getMessage());
           }
       }



    }

    public static void printNumbers(int start, int end){
        if( start<1 || start>end|| end>100){
          throw new IllegalArgumentException("Invalid numbers entered , valid range is [1 .... 100]");
        }

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

    }
}
