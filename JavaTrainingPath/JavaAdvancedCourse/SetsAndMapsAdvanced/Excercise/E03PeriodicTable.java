package JavaAdvancedCourse.SetsAndMapsAdvanced.Excercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        for (int i = 0; i < n ; i++) {
            String [] compouds = scanner.nextLine().split(" ");
            for (int j = 0; j <compouds.length ; j++) {

                periodicTable.add(compouds[j]);
            }


        }


        System.out.println(periodicTable.toString().replaceAll("[\\[\\],]" , ""));


    }

}
