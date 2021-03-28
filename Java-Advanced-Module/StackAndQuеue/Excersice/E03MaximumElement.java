package AdvancedJava.StackAndQuеue.Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt( scanner.nextLine());


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            if(command.equals("1")){
                int pushDigit = Integer.parseInt(input[1]);
                stack.push(pushDigit);

            }else if (command.equals("2")){
                stack.pop();
            }else{

                stack.stream().sorted((a,b) -> Integer.compare(b,a)).limit(1).forEach(System.out::println);
            }

        }





    }
}
