package JavaProgramingBasicsCourse.FinalExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int students = Integer.parseInt(scanner.nextLine());

        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        int groupFour = 0;


        double scoreSum = 0.0;


        for (int i = 1; i <= students; i++) {
            double score = Double.parseDouble(scanner.nextLine());

            scoreSum+= score;

            if (score >= 5.00) {
                groupOne++;

            } else if (score >= 4.00) {
                groupTwo++;

            } else if (score >= 3.00) {
                groupThree++;
            } else if (score < 3) {
                groupFour++;
            }


        }


        double topGrade = (groupOne * 1.0 / students)* 100;
        double middleGrade = (groupTwo * 1.0 / students) * 100;
        double lowGrade = (groupThree *1.0 / students) * 100;
        double fail = (groupFour *1.0 / students) * 100;

        double average = (scoreSum / students) ;

        System.out.printf("Top students: %.2f%%%n", topGrade);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",middleGrade);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",lowGrade);
        System.out.printf("Fail: %.2f%%%n",fail);
        System.out.printf("Average: %.2f",average);
    }
}
