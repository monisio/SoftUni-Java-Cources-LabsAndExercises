package Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class E10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <=num ; i++) {


            int sum = 0;

            int last = i % 10;
            sum += last;
            sum += i / 10;

            if(sum == 5 ||sum==7||sum == 11){
                System.out.printf("%d -> True%n",i);

            }else {
                System.out.printf("%d -> False%n",i);
            }
        }

/// Вариант според лекциите:
    /* int n = Integer.parseInt(sc.nextLine());
    for (int num = 1; num <= n; num++) {
    int sumOfDigits = 0;
     int digits = num;
     while (digits > 0) {
        sumOfDigits += digits % 10;
             digits = digits / 10;
  }
*/







    }
}
