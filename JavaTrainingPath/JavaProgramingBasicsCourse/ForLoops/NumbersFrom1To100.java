package JavaProgramingBasicsCourse.ForLoops;

import java.util.Scanner;

public class NumbersFrom1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= N; i+=3){
            System.out.println(i);
        }


    }
}
