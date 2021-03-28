package WhileLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = scanner.nextLine();


        String userInput = scanner.nextLine();



        while (!userInput.equals(pass)){

            userInput = scanner.nextLine();

        }

        System.out.printf("Welcome %s!",user);

    }
}
