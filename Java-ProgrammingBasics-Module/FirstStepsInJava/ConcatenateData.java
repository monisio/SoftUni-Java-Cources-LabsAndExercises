package FirstStepsInJava;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "Simeon" ;
        String lastName = "Georgiev" ;
        int age = 34;
        //int age = Integer.parseInt (scanner.nextLine());
        String str = firstName + " " + lastName + " " + " @ " + age;
        System.out.println(str);
    }
}
