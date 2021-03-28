package Fundamentals.Arrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] positionsWithLadybugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] field = new int[fieldSize];

        for (int i = 0; i < positionsWithLadybugs.length; i++) {
            int bug = positionsWithLadybugs [i];

            if (bug >= 0 && bug < field.length){
                field[bug] = 1;

            }


        }

        // Input to the program above.


        String command = scanner.nextLine();


        while (!command.equals("end")) {

            String[] commandToArray = command.split(" ");

            int bug = Integer.parseInt(commandToArray[0]);
            String directionOfMovement = commandToArray[1];
            int moves = Integer.parseInt(commandToArray[2]);
            boolean isGone = false;


            if (field[bug] == 1 && bug >= 0  && bug < field.length ) {

                if (directionOfMovement.equals("right")){

                    for (int i = bug+moves; i <= i+1 ;i+=moves) {


                        if ( i<field.length){

                            if ( field[i]!=1){
                                field[bug]=0;
                                field[i]= 1;
                                break;
                            }

                        }else{
                            isGone= true;
                            break;
                        }


                    }



                }else {

                    for (int i = bug - moves; i <= i+1; i -= moves) {


                        if (i >= 0 ) {

                            if (field[i] != 1) {
                                field[bug] = 0;
                                field[i] = 1;
                                break;
                            }

                        } else {
                            isGone = true;
                            break;
                        }


                    }

                }

            }






            if (isGone) {
                field[bug] = 0;

            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < field.length; i++) {

            System.out.print(field[i] + " ");
        }

    }
}