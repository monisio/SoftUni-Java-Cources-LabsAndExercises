package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.Scanner;

public class E01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        StringBuilder password = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s");
            String message = null;

            switch (tokens[0]) {
                case "TakeOdd":
                    StringBuilder current = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            current.append(password.charAt(i));
                        }
                    }
                    password= current;
                    message = password.toString();
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    password.delete(index, index + length);
                    message = password.toString();
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    String currentPassword = password.toString();
                    if (currentPassword.contains(substring)) {

                        password.replace(0, password.length(), currentPassword.replaceAll(substring, substitute));

                        message = password.toString();
                    }else{
                        message= "Nothing to replace!";
                    }

                    break;
            }

            if (message != null) {
                System.out.println(message);
            }

            input = scanner.nextLine();
        }


        System.out.println("Your password is: "+password.toString());


    }

}
