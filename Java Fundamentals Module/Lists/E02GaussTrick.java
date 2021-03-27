package Fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int turns = inputNumbers.size()/2;

        for (int  i = 0;  i < turns ;  i++) {

            int numberA = inputNumbers.get(i);
            int numberB = inputNumbers.get(inputNumbers.size()-1);
            int sum = numberA+numberB;
            inputNumbers.remove(inputNumbers.size()-1);

            inputNumbers.set(i, sum );





        }




        for (int number : inputNumbers) {
            System.out.print(number + " ");

        }


    }
}
