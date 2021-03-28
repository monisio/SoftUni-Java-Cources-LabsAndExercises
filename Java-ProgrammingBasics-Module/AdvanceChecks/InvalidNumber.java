package AdvanceChecks;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());



        boolean isValid = input >= 100 && input <= 200 || input == 0;

      //  if (input >= 100 && input <= 200 || input == 0) {

        //}else {
//            System.out.println("invalid");
//        }
        if (!isValid){
            System.out.println("invalid");
       }

    }
}
