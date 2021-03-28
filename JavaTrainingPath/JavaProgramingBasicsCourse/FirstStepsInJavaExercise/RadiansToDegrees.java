package JavaProgramingBasicsCourse.FirstStepsInJavaExercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radiant = Double.parseDouble(scanner.nextLine());
        // Math.PI - извиква числото П
        Double degree = radiant * 180 / Math.PI;
        // за да ограничим резултата до число след запетяа ползваме "%.0f" като цифрата определя броя знаци.
        System.out.printf("%.0f", degree);
    }
}
