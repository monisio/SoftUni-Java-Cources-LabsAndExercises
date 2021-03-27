package Fundamentals.BasicSyntaxExcercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int length = username.length();

        String password = "";
///   променливата lenght връша стойност която е по голяма от индексите на буквите, следователно чупеше
// програмата когато се опита да вземе символа на първа позиция. пример Acer text lenght = 4  ; char index range form 0 to 3 = 4 symbols;

        for (int i = length - 1; i >= 0; i--) {

            password += username.charAt(i);


        }


        String input = scanner.nextLine();
        int counter = 0;
        boolean isBlocked = false ;

        while (!input.equals(password)) {
            counter++;
            if (counter == 4) {
               isBlocked= true;
                break;
            }

            System.out.println("Incorrect password. Try again.");


            input = scanner.nextLine();
        }


        String output = "";

        if (isBlocked){
            output= String.format("User %s blocked!", username);

        }else{
            output= String.format("User %s logged in.", username);
        }

        System.out.print(output);
    }
}
