package JavaFundamentalsCourse.TextProcessing.Excercise;

import java.util.Scanner;

public class E01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] inputLine = scanner.nextLine().split(", ");


        for (String userName : inputLine) {

            boolean isValidUsername = checkIfValid(userName);


            if (isValidUsername){
                System.out.println(userName);
            }

        }




    }

    private static boolean checkIfValid(String userName) {
        if (!(userName.length()>=3&& userName.length()<=16)){
            return false;

        }

        for (int i = 0; i < userName.length() ; i++) {
            char current = userName.charAt(i);

            if(current != '-' && current!= '_' && !Character.isLetterOrDigit(current) ){
                return false;
            }

        }

        return true;
    }
}
