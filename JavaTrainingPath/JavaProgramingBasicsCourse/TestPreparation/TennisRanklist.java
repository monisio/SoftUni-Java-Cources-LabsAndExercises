package JavaProgramingBasicsCourse.TestPreparation;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournirsN = Integer.parseInt(scanner.nextLine());
        int initialScore = Integer.parseInt(scanner.nextLine());

        double winCounter= 0.0;
        int currentscore = 0;

        for (int i = 0; i < tournirsN; i++) {
            String score = scanner.nextLine();

            if (score.equals("W")) {
                currentscore += 2000;
                winCounter++;

            }else if (score.equals("F")){
                currentscore += 1200;

            } else if (score.equals("SF")){
                currentscore += 720;

            }


        }

        int scoreTotal = initialScore+ currentscore;
        int averageScore = (currentscore / tournirsN);

        double winsPercent=  (winCounter / tournirsN)*100;

        System.out.println(winCounter);
        System.out.println(scoreTotal);
        System.out.println(averageScore);
        System.out.println(winsPercent);

    }
}

