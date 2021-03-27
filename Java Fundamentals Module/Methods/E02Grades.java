package Fundamentals.Methods;

import java.util.Scanner;

public class E02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputScore = Double.parseDouble(scanner.nextLine());

        System.out.println(getGrade (inputScore));



    }

    private static String getGrade(double inputScore) {
        if (inputScore >=2.00 && inputScore<= 2.99){
            return "Fail";
        }else if (inputScore>=3 && inputScore<=3.49){
            return "Poor";
        }else if (inputScore >=3.50 && inputScore<= 4.49){
            return "Good";
        }else if (inputScore>=4.50 && inputScore<=5.49){
            return "Very Good";
        }else{
            return "Excellent";
        }


    }
}
/*•	2.00 – 2.99 - "Fail"
•	3.00 – 3.49 - "Poor"
•	3.50 – 4.49 - "Good"
•	4.50 – 5.49 - "Very good"
•	5.50 – 6.00 - "Excellent"
*/