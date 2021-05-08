package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E01ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] create = scanner.nextLine().split("\\s");

        ListyIterator<String> test = null;


        if (create.length > 1) {
            test = new ListyIterator<>(Arrays.copyOfRange(create, 1, create.length));
        } else {
            test = new ListyIterator<>();
        }


        String input = scanner.nextLine();


        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {


                case "Move":
                    System.out.println(test.Move());
                    break;

                case "Print":
                    test.Print();
                    break;

                case "HasNext":
                    System.out.println(test.HasNext());
                    break;


            }


            input = scanner.nextLine();
        }


    }
}
