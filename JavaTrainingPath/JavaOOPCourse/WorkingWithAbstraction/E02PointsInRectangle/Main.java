package JavaOOPCourse.WorkingWithAbstraction.E02PointsInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] pointsCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Point lower = new Point(pointsCoordinates[0], pointsCoordinates[1]);
        Point upper = new Point(pointsCoordinates[2], pointsCoordinates[3]);

        Rectangle rectangle= new Rectangle(lower,upper);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String[] pointInfo = scanner.nextLine().split("\\s");
            int x = Integer.parseInt(pointInfo[0]);
            int y = Integer.parseInt(pointInfo[1]);
            Point forCheck = new Point(x,y);

            System.out.println(rectangle.contain(forCheck));

        }


    }
}
