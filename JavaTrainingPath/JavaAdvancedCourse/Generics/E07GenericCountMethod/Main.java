package JavaAdvancedCourse.Generics.E07GenericCountMethod;

import JavaAdvancedCourse.Generics.E05GenericBox.Box;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Box<Double>> listOfBoxes = new ArrayList<>();

        for (int i = 0; i <n ; i++) {

            Box<Double> box = new Box<>(Double.parseDouble(scanner.nextLine()));


            listOfBoxes.add(box);
        }

        Double element = Double.parseDouble(scanner.nextLine());

        System.out.println(Count.countOfSimilar(listOfBoxes, element));




    }
}
