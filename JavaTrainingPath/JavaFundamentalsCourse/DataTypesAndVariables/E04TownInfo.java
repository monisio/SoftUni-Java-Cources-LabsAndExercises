package JavaFundamentalsCourse.DataTypesAndVariables;

import java.util.Scanner;

public class E04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", name, population,area);

    }
}
