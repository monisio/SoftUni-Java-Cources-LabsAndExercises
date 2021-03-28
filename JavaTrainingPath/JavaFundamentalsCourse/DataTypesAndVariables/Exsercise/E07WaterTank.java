package JavaFundamentalsCourse.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E07WaterTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int tank = 255 ;


        for (int i = 0; i < n ; i++) {
            int water = Integer.parseInt(scanner.nextLine());

           if ( tank - water >= 0){
               tank-= water;

           }else {
               System.out.println("Insufficient capacity!");
           }



        }
        System.out.println(255 - tank);
    }
}
