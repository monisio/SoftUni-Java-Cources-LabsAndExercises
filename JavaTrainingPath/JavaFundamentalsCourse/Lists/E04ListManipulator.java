package JavaFundamentalsCourse.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input read below
        List <Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String [] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
                int value=Integer.parseInt(command[1]);
            switch (command[0]){

                case "Add":
                      addNumberToList(inputList,value);
                    break;
                case "Remove":
                        removeNumberByValue(inputList,value);
                    break;
                case "RemoveAt":
                        removeNumberByIndex(inputList, value);
                    break;
                case  "Insert":

                      insertValueAtIndex(inputList,value,command[2]);
                    break;
            }







            command = scanner.nextLine().split(" ");
        }



        printListFinalState(inputList);




    }

    private static void printListFinalState(List<Integer> inputList) {
        for (int input:inputList) {
            System.out.print(input+" ");

        }
    }



    private static void insertValueAtIndex(List<Integer> inputList,int value, String s) {
        int index= Integer.parseInt(s);

        inputList.add(index, value);

    }

    private static void removeNumberByIndex(List<Integer> inputList, int value) {
        inputList.remove(value);
    }

    private static void removeNumberByValue(List<Integer> inputList, int value) {

        inputList.remove(Integer.valueOf(value));

    }

    private static void addNumberToList(List<Integer> inputList, int number) {


        int index = inputList.size();
        inputList.add(index, number);

    }
}
