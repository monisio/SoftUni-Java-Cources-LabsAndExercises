package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E04OpeningBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        ArrayDeque<Integer> rightPositions = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(') {
                rightPositions.push(i);
            }else if(input.charAt(i)==')'){
                int beginning = rightPositions.pop();
                System.out.println(input.substring(beginning,i+1));
            }
        }



    }
}
