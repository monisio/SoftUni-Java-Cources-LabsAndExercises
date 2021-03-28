package JavaProgramingBasicsCourse.ForLoopsExercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        "OddSum=" + {сума на числата на нечетни позиции},
//        "OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
//        "OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
//        "EvenSum=" + { сума на числата на четни позиции },
//        "EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
//        "EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
//        Всяко число трябва да е форматирано до втория знак след десетичната запетая.

        int n = Integer.parseInt(scanner.nextLine());

        double oddMin = 1000000;
        double oddMax = -1000000;

        double evenMin = 1000000;
        double evenMax = -1000000;

        double oddSum = 0.0;
        double evenSum = 0.0;

        for (int i = 1; i <= n; i++) {
            double input = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += input;

                if (evenMin > input) {
                    evenMin = input;
                }

                if (evenMax < input) {
                    evenMax = input;
                }

            } else {
                oddSum += input;

                if (oddMin > input) {
                    oddMin = input;
                }


                if (oddMax < input) {
                    oddMax = input;
                }


            }


        }


        System.out.printf("OddSum=%.2f,%n", oddSum);

        if (oddMin != 1000000) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        } else {
            System.out.println("OddMin=No,");
        }

        if (oddMax != -1000000) {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.println("OddMax=No,");
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);

        if (evenMin != 1000000) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        } else {
            System.out.println("EvenMin=No,");
        }

        if (evenMax != -1000000) {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        } else {
            System.out.println("EvenMax=No");
        }


    }
}
