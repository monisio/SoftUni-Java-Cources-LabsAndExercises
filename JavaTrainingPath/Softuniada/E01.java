package Softuniada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        List<Integer> primeList = new ArrayList<>();
        int count;
        int totalCount = 0;


        for(int i = n ; i <= m ; i++) {

            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if (count == 2) {
                System.out.print(i+" ");
                totalCount++;
            }
        }
        System.out.println();
        System.out.printf("The total number of prime numbers between %d to %d is %d",n,m,totalCount);


    }

}
