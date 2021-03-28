package JavaProgramingBasicsCourse.NestedLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());


        for (int x = floors; x >= 1; x--) {

            for (int y = 0; y < rooms; y++) {
                if (x == floors) {
                    System.out.printf("L%d%d ", x, y);
                } else if (x % 2 == 0) {
                    System.out.printf("O%d%d ",x,y);
                } else {
                    System.out.printf("A%d%d ",x,y);
                }
            }

            System.out.println();
        }


    }
}
