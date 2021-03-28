package JavaProgramingBasicsCourse.Exam;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());


        boolean isWrong = false;
        boolean isIncorect = false;

        double sumTotal = 0.0;


        if (team.equals("Argentina")) {
            if (souvenir.equals("flags")) {

                sumTotal += 3.25;
            } else if (souvenir.equals("caps")) {

                sumTotal += 7.20;
            } else if (souvenir.equals("posters")) {

                sumTotal += 5.10;
            } else if (souvenir.equals("stickers")) {

                sumTotal += 1.25;
            } else {

                isWrong = true;
            }


        } else if (team.equals("Brazil")) {
            if (souvenir.equals("flags")) {

                sumTotal += 4.20;
            } else if (souvenir.equals("caps")) {

                sumTotal += 8.50;
            } else if (souvenir.equals("posters")) {

                sumTotal += 5.35;
            } else if (souvenir.equals("stickers")) {

                sumTotal += 1.20;
            } else {

                isWrong = true;
            }

        } else if (team.equals("Croatia")) {
            if (souvenir.equals("flags")) {

                sumTotal += 2.75;
            } else if (souvenir.equals("caps")) {

                sumTotal += 6.90;
            } else if (souvenir.equals("posters")) {

                sumTotal += 4.95;
            } else if (souvenir.equals("stickers")) {

                sumTotal += 1.10;
            } else {

                isWrong = true;
            }

        } else if (team.equals("Denmark")) {
            if (souvenir.equals("flags")) {

                sumTotal += 3.10;
            } else if (souvenir.equals("caps")) {

                sumTotal += 6.50;
            } else if (souvenir.equals("posters")) {

                sumTotal += 4.80;
            } else if (souvenir.equals("stickers")) {

                sumTotal += 0.90;

            } else {

                isWrong = true;
            }


        } else {

            isIncorect = true;
        }

        double sumAll = sumTotal * amount;


        if (isWrong) {
            System.out.println("Invalid stock!");
        } else if (isIncorect) {
            System.out.println("Invalid country!");
        }else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", amount, souvenir, team, sumAll);

        }





    }
}
