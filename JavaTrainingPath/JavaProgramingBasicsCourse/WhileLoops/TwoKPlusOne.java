package JavaProgramingBasicsCourse.WhileLoops;

import java.util.Scanner;

public class TwoKPlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        //отпечатва всички числа ≤ n от редицата - 1, 3, 7, 15, 31
        //умножим предишното с 2 и добавим 1.
        int count = 1;

        while (count <= n){

            System.out.println(count);

            count = count *2 + 1;



        }


    }


}
