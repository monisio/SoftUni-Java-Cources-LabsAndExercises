package JavaProgramingBasicsCourse.ChecksExercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double social = 0.0;
        double excellent = 0.0;
        // socialna stipendiq - dohod po malyk ot minimalnata zaplata i uspeh nad 4,50

        if (income < minSalary && averageGrade >= 4.50) {

                social = Math.floor(minSalary * 0.35) ;

        }

        if (averageGrade >= 5.50  ) {
            excellent= Math.floor(averageGrade * 25);
        }



        boolean isSocial = false;


        if (social != 0 && social > excellent ){

            System.out.printf( "You get a Social scholarship %.0f BGN", social) ;
            isSocial= true;


        }


        if (excellent !=0 ) {

            if (!isSocial){

                System.out.printf( "You get a scholarship for excellent result %.0f BGN", excellent) ;
            }



        }



        if (excellent == 0 && social == 0 ){
            System.out.println("You cannot get a scholarship!");
        }



    }


}
