package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> children = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());




        while (children.size()>1){ // въртим цикъла докато имаме повече от един елемент в опашката.

            // вземаме всеки и го слагаме обратно , докато не стигнем посоченото число.
            for (int i = 1; i < n; i++) { // въртим цикъла от 1 до n-1 тъй като този който е на n-1 повторение ще е този който отпада , тоест не сменяме неговото място за да можем да го премахнем.
                children.offer(children.poll());  // вземаме този който е най-отпред на опашката и го слагаме най-отзад , когато завъртанията
                                                 // преминат най отпред остава човека който трябва да махнем от опашката.
            }

            System.out.println("Removed " + children.poll()); // премахваме този който е най отпред.


        }

        System.out.println("Last is " + children.poll()); // премахваме последния елемент като го принтираме.


    }
}
