package JavaFundamentalsCourse.Lists.Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArrays = scanner.nextLine().split("\\|");


        List<Integer> finalArray = new ArrayList<>();
        for (int i = inputArrays.length - 1; i >= 0; i--) {

            String[] element = inputArrays[i].trim().split("\\s+");


            List<Integer> current = new ArrayList<>();


            for (int j = 0; j < element.length; j++) {

               if (!element[j].equals("")){
                   current.add(Integer.parseInt(element[j]));

               }

            }


            finalArray.addAll(current);


        }
        for (Integer number : finalArray) {

            System.out.print(number + " ");
        }


    }


}
