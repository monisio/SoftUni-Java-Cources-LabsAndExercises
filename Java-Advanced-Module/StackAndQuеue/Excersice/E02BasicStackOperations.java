package AdvancedJava.StackAndQuеue.Excersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstLine = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = firstLine[0];
        int s = firstLine[1];
        int x = firstLine[2];

        String input = scanner.nextLine();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).limit(n).forEach(deque::push);


        while (s>0){
            deque.pop();
            s--;
        }

        if(deque.contains(x)){
            System.out.println("true");
        }else {
           if (deque.isEmpty()){
               System.out.println("0");
           }else{

               deque.stream().sorted(Integer::compareTo).limit(1).forEach(System.out::println);
           }
        }


    }
}
