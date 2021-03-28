package JavaAdvancedCourse.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [][] matrix =getMatrix(scanner);

        int number = Integer.parseInt(scanner.nextLine());
       boolean found = false;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]==number){
                    System.out.println(i+" "+j);
                    found=true;
                }


            }

        }

        if(!found){
            System.out.println("not found");
        }

    }


    private static int[][] getMatrix(Scanner scanner) {
        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[input[0]][input[1]];
        for (int i = 0; i <input[0] ; i++) {
            int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[i]=array;

        }

        return matrix;
    }
}
