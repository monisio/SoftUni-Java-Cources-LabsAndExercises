package JavaFundamentalsCourse.MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class E03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int cupidLastPosition = 0;

        while (!command.equals("Love!")){
            String[]tokens = command.split(" ");

            int jump = Integer.parseInt(tokens[1]) + cupidLastPosition;
            String message ="";

            if (jump>neighborhood.length-1){
                jump=0;
            }
            cupidLastPosition = jump;

            int currentHouse =  neighborhood[jump];

            if(currentHouse>0){
               neighborhood[jump]-=2;

                if(neighborhood[jump]==0){
                    message = "Place "+ jump +" has Valentine's day.";
                }
            }else{
                message= "Place "+jump + " already had Valentine's day.";
            }

            if (!message.equals("")){

                System.out.println(message);
            }


            command=scanner.nextLine();
        }


        System.out.printf("Cupid's last position was %d.%n", cupidLastPosition);

        int result = 0;

        for (int house : neighborhood) {
            if(house>0){
                result++;
            }

        }

        String output;
        if (result!=0){
            output=	"Cupid has failed "+result+" places.";
        }else{
            output= "Mission was successful.";
        }

        System.out.println(output);
    }
}
