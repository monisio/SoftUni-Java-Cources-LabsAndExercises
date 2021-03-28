package Fundamentals.Methods;

import java.util.Scanner;

public class E09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();



        if (type.equals("int")){
          int a = Integer.parseInt(scanner.nextLine());
          int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(a,b));

        }else if (type.equals("char")){
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.println(getMax(a,b));
        }else {
            String inputA = scanner.nextLine();
            String inputB = scanner.nextLine();

            System.out.println(getMax(inputA,inputB));
        }




    }



    private static int getMax(int a, int b) {
        if (a>b){
            return a;

        }else {
            return b;
        }
    }

    private static char getMax(char a, char b) {


        if (a > b){
           return a;

        }else {
           return b;
        }
    }


    private static String getMax(String a, String b) {




        if(a.compareTo(b)>=0){
            return a;
        }else {
            return b ;
        }



    }
}
