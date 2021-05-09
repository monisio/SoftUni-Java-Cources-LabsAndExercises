package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E03Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays.stream(scanner.nextLine().split(",\\s")).mapToInt(Integer::parseInt).toArray();


        Lake<Integer> lake = new Lake<>();

        for (int i : input) {
            lake.add(i);
        }

        for (Integer lakeStone : lake) {
            System.out.print(lakeStone+" ");

        }

    }


}
