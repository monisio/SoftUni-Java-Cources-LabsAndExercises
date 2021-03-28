package AdvancedJava.SetsAndMapsAdvanced.Excercise;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<String> setOne = new LinkedHashSet<>();
        Set<String> setTwo = new LinkedHashSet<>();

        for (int i = 0; i < n + m; i++) {

            if (i < n) {
                setOne.add(scanner.nextLine());
            } else {
                setTwo.add(scanner.nextLine());
            }

        }


        Iterator iterator = setOne.iterator();

        while (iterator.hasNext()) {
            String a = String.valueOf(iterator.next());

            if (setTwo.contains(a)) {
                System.out.print(a + " ");
            }
        }


    }
}
