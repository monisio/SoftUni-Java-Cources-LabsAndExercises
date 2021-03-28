package AdvancedJava.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> partySet = new TreeSet<>();

        while (!input.equals("PARTY")){

            partySet.add(input);

            input= scanner.nextLine();

        }
            input= scanner.nextLine();

        while (!input.equals("END")){

            partySet.remove(input);


            input= scanner.nextLine();

        }

        System.out.println(partySet.size());
        partySet.forEach(System.out::println);

    }
}
