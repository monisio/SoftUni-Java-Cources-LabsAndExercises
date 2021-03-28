package JavaProgramingBasicsCourse.WhileLoopsExcercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int target = 10000;


        while (target > 0) {

            if (input.equals("Going home")) {
                int goingHomeSteps = Integer.parseInt(scanner.nextLine());
                target = target - goingHomeSteps;
                break;
            }

            int steps = Integer.parseInt(input);

            target = target - steps;


            if (target>0){

                input = scanner.nextLine();
            }


        }

        if (target > 0){
            System.out.printf("%d more steps to reach goal.",target);
        }else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",Math.abs(target));
        }


    }
}
