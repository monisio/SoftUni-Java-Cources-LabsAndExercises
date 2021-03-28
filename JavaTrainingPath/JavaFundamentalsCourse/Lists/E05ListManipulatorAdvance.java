package JavaFundamentalsCourse.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05ListManipulatorAdvance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");


        while (!command[0].equals("end")) {

            switch (command[0]) {

                case "Contains":
                    printContained(input, command[1]);
                    break;
                case "Print":
                    if (command[1].equals("even"))
                        printEvenElements(input);
                    else if (command[1].equals("odd")) {

                        printOddElements(input);
                    }
                    break;
                case "Get":
                    printSumOfElements(input);
                    break;

                case "Filter":
                    printFilteredElements(input, command[1], command[2]);

                    break;
            }


            command = scanner.nextLine().split(" ");
        }


    }

    private static void printFilteredElements(List<Integer> input, String condition, String number) {
        int value = Integer.parseInt(number);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.size(); i++) {

            if (condition.equals(">")) {

                if (input.get(i) > value) {
                    output.append(input.get(i));


                }
            } else if (condition.equals("<")) {
                if (input.get(i)<value){
                    output.append(input.get(i));


                }

            }else if (condition.equals(">=")){
                if (input.get(i)>=value){
                    output.append(input.get(i));

                }

            }else if(condition.equals("<=")){
                if (input.get(i)<=value ){
                    output.append(input.get(i));

                }

            }
            output.append(" ");
        }

        System.out.println(output);
    }

    private static void printSumOfElements(List<Integer> input) {
        int sum = 0;

        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);

        }

        System.out.println(sum);
    }

    private static void printEvenElements(List<Integer> input) {
        for (int i = 0; i < input.size(); i++) {

            if (input.get(i) % 2 == 0) {
                System.out.print(input.get(i) + " ");
            }

        }
        System.out.println();
    }

    private static void printOddElements(List<Integer> input) {

        for (int i = 0; i < input.size(); i++) {

            if (input.get(i) % 2 != 0) {
                System.out.print(input.get(i) + " ");
            }

        }

        System.out.println();
    }

    private static void printContained(List<Integer> input, String token) {
        int value = Integer.parseInt(token);

        if (input.contains(value)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }


    }
}
