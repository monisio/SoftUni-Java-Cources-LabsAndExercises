package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.Scanner;

public class E01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder rawActivationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String token = tokens[1];
            String message = null;

            switch (tokens[0]) {

                case "Contains":

                    if (rawActivationKey.indexOf(token) != -1) {
                        message = rawActivationKey + " contains " + token;
                    } else {
                        message = "Substring not found!";
                    }

                    break;
                case "Flip":

                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String changeString = rawActivationKey.substring(startIndex, endIndex);
                    if (tokens[1].equals("Upper")) {
                        rawActivationKey.replace(startIndex, endIndex, changeString.toUpperCase());
                    } else {
                        rawActivationKey.replace(startIndex, endIndex, changeString.toLowerCase());

                    }

                    message = rawActivationKey.toString();

                    break;
                case "Slice":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);

                    rawActivationKey.delete(start, end);
                    message = rawActivationKey.toString();
                    break;

            }


            if (message != null) {
                System.out.println(message);
            }

            input = scanner.nextLine();
        }

        System.out.println("Your activation key is: "+rawActivationKey);

    }
}
