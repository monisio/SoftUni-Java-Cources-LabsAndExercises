package JavaAdvancedCourse.SetsAndMapsAdvanced.Excercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01UniqueUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set <String> nameSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {

             nameSet.add(scanner.nextLine());
        }


        nameSet.forEach(System.out::println);

    }
}
