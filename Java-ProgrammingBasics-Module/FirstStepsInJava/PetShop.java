package FirstStepsInJava;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int nondog = Integer.parseInt(scanner.nextLine());
        double pricedog = dogs * 2.5;
        double pricenondog = nondog * 4;
        double sum = pricedog + pricenondog;
        System.out.print(sum);




    }
}
