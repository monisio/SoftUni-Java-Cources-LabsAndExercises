package FirstStepsInJavaExercise1;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //трябва да преобразуваме percent в процент с деление да percent на 100 , задаваме приоритет с скоби.
        double interestMonth = (money * percent / 100) / 12;
        double result = money + time * interestMonth;
        System.out.print(result);

    }
}
