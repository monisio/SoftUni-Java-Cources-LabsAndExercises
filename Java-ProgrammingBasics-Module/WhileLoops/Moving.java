package WhileLoops;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();


        int apartmentVolume = width * lenght * height;


        while (!command.equals("Done")) {

            int boxes = Integer.parseInt(command);

            apartmentVolume = apartmentVolume - boxes;

            if (apartmentVolume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(apartmentVolume));
                break;
            }


            command = scanner.nextLine();


        }

        if (command.equals("Done")) {
            System.out.printf("%d Cubic meters left.", apartmentVolume);

        }

    }
}
