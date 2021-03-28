package JavaFundamentalsCourse.Lists.Excersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08AnnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }else if(startIndex>input.size()-1){
                    startIndex= input.size()-1;
                }

                if (endIndex > input.size()-1 ) {
                    endIndex = input.size()-1 ;
                }

                getMergedIndexes(input, startIndex, endIndex);


            } else if (tokens[0].equals("divide")) {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);

                getDividedIndex(input, index, partitions);


            }

            command = scanner.nextLine();
        }

        for (String element :input) {

            System.out.print(element+" ");
        }

    }

    private static void getDividedIndex(List<String> input, int index, int partitions) {

        String element = input.get(index);
        input.remove(index);

        List<Character> elementList = new ArrayList<>();

        for (int i = 0; i < element.length(); i++) {
            elementList.add(element.charAt(i));

        }



        int partitionSize = elementList.size()/ partitions;

        List <String> elementsToAdd = new ArrayList<>();

        while (!elementList.isEmpty()) {

            String partitionCurrent ="";

            int rotations;

            if(partitions > 1){
                rotations = partitionSize;
            }else{
                rotations= elementList.size();
            }


            for (int i = 0; i < rotations ; i++) {
                partitionCurrent += elementList.get(0);

                elementList.remove(0);
            }

            partitions--;

             elementsToAdd.add(partitionCurrent);
        }



        input.addAll(index, elementsToAdd);



    }

    private static void getMergedIndexes(List<String> input, int startIndex, int endIndex) {

        String mergedLine = "";

        for (int i = startIndex; i <= endIndex; i++) {

            String element = input.get(startIndex);
            input.remove(startIndex);


            mergedLine += element;


        }

        input.add(startIndex, mergedLine);

    }


}
