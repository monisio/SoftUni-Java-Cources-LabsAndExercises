package Fundamentals.Lists.Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
/*•	Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times
*/
        while (!command.contains("End")) {

            switch (command.get(0)) {

                case "Add":
                    int numberAdd = Integer.parseInt(command.get(1));
                    inputNumbersList.add(numberAdd);
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(command.get(2));
                    int numberInsert = Integer.parseInt(command.get(1));

                    if(indexToInsert>=0 && indexToInsert<inputNumbersList.size()){

                        inputNumbersList.add(indexToInsert, numberInsert);
                    }else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Remove":
                    int indexToRemove= Integer.parseInt(command.get(1));

                    if(indexToRemove >=0 && indexToRemove<inputNumbersList.size()){
                        inputNumbersList.remove(indexToRemove);

                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int shiftTimes = Integer.parseInt(command.get(2));

                    if (command.contains("left")) {
                        for (int i = 0; i < shiftTimes ; i++) {

                            int first = inputNumbersList.get(0);
                            inputNumbersList.remove(0);
                            inputNumbersList.add(first);

                        }
                    } else if (command.contains("right")){

                        for (int i = 0; i <shiftTimes ; i++) {
                            int last = inputNumbersList.get(inputNumbersList.size()-1);
                            inputNumbersList.remove(inputNumbersList.size()-1);
                            inputNumbersList.add(0, last);

                        }

                    }
                    break;
            }


            command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }


        for (int number :inputNumbersList) {
            System.out.print(number+" ");
        }

    }
}
