package JavaOOPCourse.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class E01SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.sqrt(number));

        }catch (NumberFormatException e){
            System.out.println("Invalid Number");
        }finally {
            System.out.println("Good Bye");
        }




    }

}
