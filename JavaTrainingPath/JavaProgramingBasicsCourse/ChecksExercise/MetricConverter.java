package JavaProgramingBasicsCourse.ChecksExercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputDigit = Double.parseDouble(scanner.nextLine());
        String metric = scanner.nextLine();
        String metricOut = scanner.nextLine();

        double output = 0.0;
        // m - cm- mm
        // 1 - 100 - 1000


        if (metric.equals("m")) {
            if (metricOut.equals("cm")) {
                output = inputDigit * 100;
            } else if (metricOut.equals("mm")) {
                output = inputDigit * 1000;
            }
        } else if (metric.equals("cm")) {          // with else if construction
            if (metricOut.equals("mm")) {
                output = inputDigit * 10;

            } else {
                output = inputDigit / 100;
            }
        } else if (metric.equals("mm")) {
            if (metricOut.equals("cm")) {           // with else construction
                output = inputDigit / 10;
            } else {
                output = inputDigit / 1000;
            }
        }

        System.out.printf("%.3f", output);
        // cm - mm - m
        // 100 - 1000 - 1


        // mm - cm - m
        // 1000 - 100 - 1


    }
}