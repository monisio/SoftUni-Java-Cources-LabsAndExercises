package JavaProgramingBasicsCourse.WhileLoopsExcercise;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lookName = scanner.nextLine();

        String bookName = scanner.nextLine();

        int quantity = 0;

        while  (!bookName.equals(lookName)){


            if (bookName.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",quantity);
                break;
            }

            quantity += 1;

            bookName = scanner.nextLine();

        }

        if(bookName.equals(lookName)){
            System.out.printf("You checked %d books and found it.",quantity);
        }

    }


}
