package AdvancedJava.StackAndQuеue.Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E09ShuntingYardAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();


        for (int i = 0; i < input.length; i++) {
            String current = input[i];

            if (!"+-*/()".contains(current)) {
                queue.offer(current);
            } else if (current.equals("(")) {
                stack.push(current);
            } else if (current.equals(")")) {

                while (!stack.peek().equals("(")) {

                    queue.offer(stack.pop());
                }
                stack.pop();

            } else {

                if ("+-".contains(current)) {

                    if (!stack.isEmpty()&& !stack.peek().equals("(")) {
                        queue.offer(stack.pop());
                    }

                    stack.push(current);

                } else  {

                    if(!stack.isEmpty()&& "*/".contains(stack.peek()) ){
                        queue.offer(stack.pop());
                    }

                    stack.push(current);
                }

            }


        }


        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }


    }
}
