package JavaAdvancedCourse.Generics.E06GenericSwapMethod;

import JavaAdvancedCourse.Generics.E05GenericBox.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Box<Integer>> listOfBoxes = new ArrayList<>();

        for (int i = 0; i <n ; i++) {

            Box<Integer> box = new Box<>(Integer.parseInt(scanner.nextLine()));


            listOfBoxes.add(box);
        }

        int[] tokens = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        SwapList.swap(listOfBoxes,tokens[0],tokens[1]);

        for (Box<Integer> b : listOfBoxes) {

            System.out.println(b.toString());
        }

    }


}
