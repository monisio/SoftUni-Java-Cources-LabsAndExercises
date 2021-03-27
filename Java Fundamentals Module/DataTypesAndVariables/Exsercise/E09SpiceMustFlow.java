package Fundamentals.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());


        int spice = 0;
        int days = 0;


        while (source >= 100){

            spice +=source ;
            if (spice >= 26){
                spice -= 26;
            }
            days++;
            source -=10;

        }

        if (spice>= 26){

            spice -= 26;
        }

        System.out.println(days);
        System.out.println(spice);



    }
}
