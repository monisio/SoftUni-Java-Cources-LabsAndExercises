package JavaProgramingBasicsCourse.FinalExam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double score = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();




        double winSum = 0.0;




        if (location.equals("Bulgaria")) {
            winSum = score * dancers;

            if (season.equals("summer")) {
                winSum *= 0.95;
            } else if (season.equals("winter")) {
                winSum *= 0.92;
            }

        } else if (location.equals("Abroad")) {
            winSum = (score * dancers) * 1.5 ;

            if (season.equals("summer")) {
                winSum *= 0.90;
            } else if (season.equals("winter")) {
                winSum *= 0.85;
            }

        }

        double charity = winSum * 0.75;

        winSum -= charity;

        double perDancer = winSum/ dancers ;

        System.out.printf("Charity - %.2f%n",charity);
        System.out.printf("Money per dancer - %.2f",perDancer);


    }
}
