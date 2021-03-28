package JavaFundamentalsCourse.BasicSyntaxExcercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double perNight = 0.0;
        double discount = 0.0;


        if (peopleType.equals("Students")) {

            if (dayOfTheWeek.equals("Friday")) {
                perNight = 8.45;
            } else if (dayOfTheWeek.equals("Saturday")) {
                perNight = 9.80;
            } else if (dayOfTheWeek.equals("Sunday")) {
                perNight = 10.46;
            }

            if (peopleCount >= 30) {
                discount = 0.85;
            }

        } else if (peopleType.equals("Business")) {
            if (peopleCount >= 100) {
                peopleCount -= 10;
            }

            if (dayOfTheWeek.equals("Friday")) {
                perNight = 10.90;
            } else if (dayOfTheWeek.equals("Saturday")) {
                perNight = 15.60;
            } else if (dayOfTheWeek.equals("Sunday")) {
                perNight = 16;
            }

        } else if (peopleType.equals("Regular")) {

            if ( peopleCount >= 10 && peopleCount <= 20){
                discount = 0.95;
            }

            if (dayOfTheWeek.equals("Friday")) {
                perNight = 15;
            } else if (dayOfTheWeek.equals("Saturday")) {
                perNight = 20;
            } else if (dayOfTheWeek.equals("Sunday")) {
                perNight = 22.50;
            }




        }


        double total = peopleCount * perNight;

        if (discount !=0){
            total *= discount;
        }

        System.out.printf("Total price: %.2f",total);

    }
}


        /*if (peopleType.equals("Bussiness")&& peopleCount>= 100){
            peopleCount-=10;

        }

        if (dayOfTheWeek.equals("Friday")) {

            if (peopleType.equals("Students")) {
                perNight = 8.45;


            } else if (peopleType.equals("Bussiness")) {
                perNight = 10.90;


            } else if (peopleType.equals("Regular")) {
                perNight = 15;
            }


        } else if (dayOfTheWeek.equals("Saturday")) {

            if (peopleType.equals("Students")) {
                perNight = 9.80;
            } else if (peopleType.equals("Bussiness")) {
                perNight = 15.60;
            } else if (peopleType.equals("Regular")) {
                perNight = 20;
            }

        } else if (dayOfTheWeek.equals("Sunday")) {

            if (peopleType.equals("Students")) {
                perNight = 10.46;
            } else if (peopleType.equals("Bussiness")) {
                perNight = 16 ;
            } else if (peopleType.equals("Regular")) {
                perNight = 22.50;
            }

        }


        double sum = peopleCount * perNight;


        if(peopleType.equals("Students")&& peopleCount >= 30){
            sum *= 0.85;
        }else if (peopleType.equals("Regular") && peopleCount >=10 && peopleCount<= 20 ){
            sum *= 0.90;
        }*/




