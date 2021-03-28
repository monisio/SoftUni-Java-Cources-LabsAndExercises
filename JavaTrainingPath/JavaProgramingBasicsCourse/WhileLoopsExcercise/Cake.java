package JavaProgramingBasicsCourse.WhileLoopsExcercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int cake = length * width;


        while (cake > 0) {

            if (input.equals("STOP")) {

                break;
            } else {
                int takePiece = Integer.parseInt(input);
                cake = cake - takePiece;
            }


            if (cake > 0) {
                input = scanner.nextLine();
            }

        }

        if (cake > 0) {
            System.out.printf("%d pieces are left.", cake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
        }

    }
}

