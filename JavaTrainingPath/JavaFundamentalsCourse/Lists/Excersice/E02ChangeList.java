package JavaFundamentalsCourse.Lists.Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String commandLine = scanner.nextLine();


        while (!commandLine.equals("end")) {
            String[] tokens = commandLine.split("\\s+");

            if (tokens[0].equals("Delete")) {
                int value = Integer.parseInt(tokens[1]);

                for (int i = 0; i < inputNumbers.size(); i++) {

                    inputNumbers.remove(Integer.valueOf(value));

                }

            } else if(tokens[0].equals("Insert")){
                int value = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);

                if(index>=0 && index<=inputNumbers.size()){

                    inputNumbers.add(index, value);
                }
            }

            commandLine = scanner.nextLine();
        }

        for (int number : inputNumbers) {
            System.out.print(number + " ");
        }

    }


}


