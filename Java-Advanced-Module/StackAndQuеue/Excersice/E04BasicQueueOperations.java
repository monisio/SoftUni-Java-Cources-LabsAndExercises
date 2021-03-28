package AdvancedJava.StackAndQuеue.Excersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.offer(element);
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }



        if (queue.isEmpty()){
            System.out.println("0");
        }else if(queue.contains(x)){
            System.out.println("true");
        }else {
            int smallest = Integer.MAX_VALUE;

            while (!queue.isEmpty()) {
                int a =  queue.poll();

                if (a<smallest){
                    smallest=a;
                }
            }

            System.out.println(smallest);

        }







    }
}
