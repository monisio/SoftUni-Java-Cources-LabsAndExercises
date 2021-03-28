package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E04SlowAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> rightPositions = new ArrayDeque<>();

        int length = input.length();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(') {
                rightPositions.push(i);
                int openingBrackets = 0;

                for (int j = i + 1; j < input.length(); j++) {

                    if (input.charAt(j) == '(') {
                        openingBrackets++;
                    } else if (input.charAt(j) == ')') {

                        if (openingBrackets == 0) {
                            rightPositions.push(j);
                            break;
                        } else {

                            openingBrackets--;
                        }


                    }

                }

            }


        }


// second stack to be read in opposite direction
        while (!rightPositions.isEmpty()) {
            int endPosition = rightPositions.pop()+1;
            int firstPosition = rightPositions.pop();


            System.out.println(input.substring(firstPosition, endPosition));

        }


    }
}
