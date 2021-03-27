package Fundamentals.RegularExpressions.Excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String expression = " [A-Za-z0-9]+[._-]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z])+";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(input);

        while (m.find()){
            System.out.println(m.group());
        }


    }
}
