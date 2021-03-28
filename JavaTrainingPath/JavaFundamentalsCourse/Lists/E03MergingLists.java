package JavaFundamentalsCourse.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputAList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> inputBList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        List<String> mergedList = getMergedList(inputAList, inputBList);


        for (String merged : mergedList) {
            System.out.print(merged + " ");

        }


    }

    private static List<String> getMergedList(List<String> inputAList, List<String> inputBList) {

        List<String> mergedList = new ArrayList<>();


        int sizeOfBigger = getBigger(inputAList.size(), inputBList.size());


        int counter = 0;
        while (counter <= sizeOfBigger) {

            if (counter < inputAList.size()) {
                mergedList.add(inputAList.get(counter));
            }

            if (counter < inputBList.size()) {
                mergedList.add(inputBList.get(counter));
            }

            counter++;
        }


        return mergedList;
    }

    private static int getBigger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }


}
