package JavaAdvancedCourse.StackAndQueue.Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E06BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        ArrayDeque<Character> rightPart = new ArrayDeque<>();


        boolean isBalanced = true;

        String lookUpTable = "{[(";

        if (input.length%2 != 0){
            isBalanced = false;
        }else{

            for (int i = 0; i < input.length ; i++) {
                char current = input[i];


                if(lookUpTable.contains(String.valueOf(current))){  //String.valueOf() can be replaced by current+"";
                    rightPart.push(current);

                }else {

                    char a = rightPart.pop();

                    if(!(a == '('&& current==')'|| a=='[' && current==']'||a=='{' && current=='}')){
                        isBalanced = false;
                        break;
                    }

                }



            }



        }


        if (isBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
