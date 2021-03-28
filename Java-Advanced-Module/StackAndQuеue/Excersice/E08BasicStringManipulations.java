package AdvancedJava.StackAndQuеue.Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E08BasicStringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder line = new StringBuilder();
        ArrayDeque<String> memory = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            if (command.equals("1")) {
                memory.push(String.valueOf(line));
                line.append(tokens[1]);

            } else if (command.equals("2")) {
                memory.push(String.valueOf(line));
                int size= Integer.parseInt(tokens[1]);
                int endIndex = line.length();
                int firstIndex = endIndex - size ;
                line.delete(firstIndex, endIndex);


            } else if (command.equals("3")) {
                int index = Integer.parseInt(tokens[1]);
                System.out.println(line.charAt(index - 1));

            } else {
                line= new StringBuilder(memory.pop());
            }


        }


    }

}

