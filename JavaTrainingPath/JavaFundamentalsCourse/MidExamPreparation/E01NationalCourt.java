package JavaFundamentalsCourse.MidExamPreparation;

import java.util.Scanner;

public class E01NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personOne = scanner.nextInt();
        int personTwo = scanner.nextInt();
        int personThree = scanner.nextInt();
        int incomingPersons = scanner.nextInt();
        int personsPerHour = personOne+personTwo+personThree;

        int time = 0;


        while(incomingPersons>0){
            incomingPersons-=personsPerHour;
            time++;

            if (time % 4 == 0){
                time++;
            }

        }


        System.out.printf("Time needed: %dh.",time);


    }

}
