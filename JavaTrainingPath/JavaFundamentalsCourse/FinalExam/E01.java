package JavaFundamentalsCourse.FinalExam;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] tokens = input.split("\\s");
            String output = null;
            if (input.contains("Upper")) {
                email = email.toUpperCase();
                output = email;
            } else if (input.contains("Lower")) {
                email = email.toLowerCase();
                output = email;
            } else if (input.contains("GetDomain")) {
                int count = Integer.parseInt(tokens[1]);
                output = email.substring(email.length() - count);
            } else if (input.contains("GetUsername")) {
                if (email.contains("@")){
                    output= email.substring(0,email.indexOf("@"));
                }else{
                    output= String.format("The email %s doesn't contain the @ symbol.", email);
                }


            } else if (input.contains("Replace")) {
                    String character = tokens[1];
                email = email.replaceAll(character, "-");
                    output=email;
            } else if (input.contains("Encrypt")) {
                for (int i = 0; i <email.length() ; i++) {
                    System.out.print((int) email.charAt(i) +" ");

                }

            }

            if(output!=null){
                System.out.println(output);
            }

            input = scanner.nextLine();
        }


    }
}
