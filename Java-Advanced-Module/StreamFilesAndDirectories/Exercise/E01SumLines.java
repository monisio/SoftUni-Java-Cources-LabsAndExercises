package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E01SumLines {
    public static void main(String[] args) throws IOException {

        String path = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/input.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String a ;
            while ((a = reader.readLine())!= null){
                int sum = 0;

                for (int i = 0; i < a.length(); i++) {
                    sum+= a.charAt(i);
                }

                System.out.println(sum);
            }

        } catch (IOException e ){
           e.printStackTrace();
        }

        //Втория вариант с Static Class Files  е по-бърз показан на упражненията.

        Files.readAllLines(Path.of(path))
                .stream()
                .map(String::toCharArray)
                .forEach(c-> {
                    int bytes = 0;
            for (char symbol : c) {
                    bytes+=symbol;
            }
                    System.out.println(bytes);
        });
    }
}
