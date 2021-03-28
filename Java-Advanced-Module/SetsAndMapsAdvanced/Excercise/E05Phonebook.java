package AdvancedJava.SetsAndMapsAdvanced.Excercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        String [] input  = scanner.nextLine().split("-");

        while (!input[0].equals("search")){

            phoneBook.put(input[0], input[1]);

            input= scanner.nextLine().split("-");
        }

        String person = scanner.nextLine();
        while (!person.equals("stop")){

            String number = phoneBook.get(person);

            if (number==null){
                System.out.println("Contact "+person+" does not exist.");
            }else{
                System.out.println(person+" -> "+number);
            }

            person=scanner.nextLine();
        }

    }
}
