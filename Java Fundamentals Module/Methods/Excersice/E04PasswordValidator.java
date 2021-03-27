package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputPassword = scanner.nextLine();


        boolean isLongEnough = checkLength(inputPassword);
        boolean isOnlyLettersAndDigits = checkLettersDigits(inputPassword);
        boolean isWithTwoDigits = checkForTwoDigits(inputPassword);

        if (!isLongEnough){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isOnlyLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isWithTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if (isLongEnough && isOnlyLettersAndDigits&& isWithTwoDigits){
            System.out.println("Password is valid");
        }

    }

    private static boolean checkForTwoDigits(String inputPassword) {

        int digitsCount = 0;

        for (int i = 0; i < inputPassword.length(); i++) {

            if (inputPassword.charAt(i) >= 48 && inputPassword.charAt(i) <= 57) {
                digitsCount++;

            }

        }

        if(digitsCount>=2){
            return true;
        }else {
            return false;
        }
    }

    private static boolean checkLettersDigits(String inputPassword) {
       boolean isCorrect = true;

        for (int i = 0; i < inputPassword.length() ; i++) {

            if (!(inputPassword.charAt(i) >= 48 && inputPassword.charAt(i) <= 57 || inputPassword.charAt(i) >= 65 && inputPassword.charAt(i) <= 90 || inputPassword.charAt(i) >= 97 && inputPassword.charAt(i) <= 172)) {
               isCorrect=false;
               break;
            }
        }

        if(isCorrect){
            return true;
        }else{
            return false;
        }
    }

    private static boolean checkLength(String inputPassword) {

        if(inputPassword.length()>=6 && inputPassword.length()<=10){
            return true;
        }else{
            return false;
        }

    }


}
