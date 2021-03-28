package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.*;

public class E03ToUpperCase {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\Exercise\\Resources\\input.txt";
        String outputPath = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\Exercise\\Resources\\outputExcrs.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter( new FileOutputStream(outputPath));){

            int current ;

            while((current=reader.read()) !=-1){

                writer.print(Character.toUpperCase((char) current));

            }


        }


    }
}
