package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> children = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());

        int cycles = 1 ;

        while (children.size()>1){


            for (int i = 1; i < n ; i++) {
                children.offer(children.poll());
            }

            if(isPrime(cycles)){
                System.out.println( "Prime "+children.peek());
            }else{
                System.out.println("Removed "+children.poll());
            }


            cycles++;
        }


        System.out.println("Last is " + children.poll());

    }

    private static boolean isPrime(int cycles) {
        boolean isPrime = true;

        if( cycles== 1){
            isPrime = false;
        }else{

            for (int i = 2; i < cycles ; i++) {

                if (  cycles % i == 0){
                    isPrime=false;
                }

            }
        }

        return isPrime;
    }
}
