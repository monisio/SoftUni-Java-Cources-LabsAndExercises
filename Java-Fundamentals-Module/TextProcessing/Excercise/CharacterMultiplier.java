package Fundamentals.TextProcessing.Excercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();


       int sum = getSumOfChars(a,b);

        System.out.println(sum);
    }

    private static int getSumOfChars(String a, String b) {
        int sum = 0;

        int length = Math.min(a.length(),b.length());



        for (int i = 0; i < length; i++) {
            int charA = a.charAt(i);
            int charB = b.charAt(i);

            sum+= charA* charB;
        }

        String longer = getTheLongerString(a, b);

        if (longer!= null){

            for (int i = length; i < longer.length() ; i++) {
                int charA = longer.charAt(i);
                sum += charA;
            }

        }
        return sum;
        // check the length of the strings
        // take length of shorter and split the longer

        // loop through both while using shorter length as stop point


    }

    private static String getTheLongerString(String a, String b) {

        if(a.length()>b.length()){
            return a;
        }else if(b.length()>a.length()){
            return b;
        }else{
            return null;
        }

    }
}