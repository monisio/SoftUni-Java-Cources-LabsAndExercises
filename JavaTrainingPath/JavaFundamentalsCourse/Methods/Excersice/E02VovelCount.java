package JavaFundamentalsCourse.Methods.Excersice;

import java.util.Scanner;

public class E02VovelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = (scanner.nextLine().toLowerCase());


        System.out.println(getSumOfVowels(input));

    }

    private static int getSumOfVowels(String input) {

        int vowelSum = 0;

        for (int i = 0; i <input.length() ; i++) {
            char currentletter = (input.charAt(i));

            if (currentletter=='a'|| currentletter== 'e'||currentletter=='i'|| currentletter=='o'||currentletter=='u'){
                vowelSum++;
            }

        }

        return vowelSum;

    }

}
