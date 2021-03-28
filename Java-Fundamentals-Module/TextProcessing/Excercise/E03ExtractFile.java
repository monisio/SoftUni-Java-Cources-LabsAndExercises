package Fundamentals.TextProcessing.Excercise;

import java.util.Scanner;

public class E03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String filename= input.substring(input.lastIndexOf('\\')+1, input.indexOf('.'));
        String fileType=  input.substring(input.indexOf(".")+1);


        System.out.println("File name: "+filename+System.lineSeparator()+"File extension: "+fileType);

    }
}
