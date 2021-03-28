package JavaFundamentalsCourse.Lists.Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = scanner.nextInt();
        int bombPower = scanner.nextInt();

        int bombFoundAt = inputNumbersList.indexOf(bombNumber);


        while (bombFoundAt != -1) {

            //BOOOM bomb explodes and destroys nearest bombPower items.

            int detonationPlace = bombFoundAt - bombPower;

            int explosionTimes = bombPower * 2 + 1;

            if(detonationPlace<0){
                detonationPlace=0;
            }

            while (detonationPlace<inputNumbersList.size()&&explosionTimes>0) {

               inputNumbersList.remove(detonationPlace);

                explosionTimes--;
            }


            bombFoundAt = inputNumbersList.indexOf(bombNumber);
        }

        int finalSum = 0;
        for (int number : inputNumbersList) {

            finalSum += number;

        }

        System.out.println(finalSum);
    }
}
