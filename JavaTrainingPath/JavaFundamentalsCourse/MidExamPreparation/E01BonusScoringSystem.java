package JavaFundamentalsCourse.MidExamPreparation;

import java.util.Scanner;

public class E01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());

        int countOfTheLectures =Integer.parseInt( scanner.nextLine());

        int additionalBonus = Integer.parseInt(scanner.nextLine());

        Double max = 0.0;
        int attendances = 0;
//{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})

        // Initial mistake was that we let division to 0 and 0 division to happen. Check input for zeros if have a division operation.
        if(studentCount!=0&&countOfTheLectures!=0){

            for (int i = 0; i <studentCount ; i++) {
                int studentAttendance = Integer.parseInt(scanner.nextLine());

                double currentScore  = 1.0* studentAttendance/countOfTheLectures * (5+ additionalBonus);

                if(max< currentScore){
                    max= currentScore;
                    attendances= studentAttendance;
                }



            }
        }

        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", Math.ceil(max), attendances);

//"Max Bonus: {maxBonusPoints}."
//"The student has attended {studentAttendances} lectures."
    }
}
