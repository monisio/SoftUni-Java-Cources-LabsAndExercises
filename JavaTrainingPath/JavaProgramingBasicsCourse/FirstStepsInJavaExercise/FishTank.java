package JavaProgramingBasicsCourse.FirstStepsInJavaExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

//        double volume = (lenght * width * height) * 0.001;
//
//        double volPercent = percent * 0.01;
//
//        double total = volume * (1 - volPercent);

        double volume = lenght * width * height;
        double volumeLiters = volume / 1000;
        double total = volumeLiters - volumeLiters * percent / 100;


        System.out.printf("%.2f", total);


    }
}
