package Fundamentals.Arrays;

import java.util.Scanner;

public class E01DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] weekDayName= new String[] { "Monday" ,"Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int dayAsNumber = scanner.nextInt();


        if(dayAsNumber>0 && dayAsNumber<=7){
            System.out.println(weekDayName[dayAsNumber - 1]);

        }else {
            System.out.println("Invalid day!");
        }





    }
}
