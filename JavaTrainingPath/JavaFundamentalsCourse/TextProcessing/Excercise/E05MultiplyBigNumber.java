package JavaFundamentalsCourse.TextProcessing.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceFirst("0+", "");



        int multiplier = Integer.parseInt(scanner.nextLine());

        if (input.isEmpty()){
            input="0";

        }
        int []  inputNumber = Arrays.stream(input.split("")).mapToInt(e-> Integer.parseInt(e)).toArray();

        if (multiplier==0){
            System.out.println(0);
            return;
        }


        List<Integer> result = new ArrayList<>();

        int onMind = 0;


        for (int i = inputNumber.length - 1; i >= 0; i--) {
            int currentNum = inputNumber[i];
            int  multiply = currentNum * multiplier + onMind;

            int numberToAdd = multiply % 10;
            onMind = multiply / 10;
            result.add(0, numberToAdd);


        }

        if(onMind>0){
            result.add(0, onMind);

        }

        for (Integer integer : result) {
            System.out.print(integer);
        }

    }
}
