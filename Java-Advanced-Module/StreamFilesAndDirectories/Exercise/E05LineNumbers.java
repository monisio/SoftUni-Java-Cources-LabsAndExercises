package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E05LineNumbers {
    public static void main(String[] args) throws IOException {


        String input = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/inputLineNumbers.txt";
        String output = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/outputExcrs.txt";
// PrintWriter дава възможност да печатаме редове в файл като ги аппендваме в самоя файл
        PrintWriter writer =  new PrintWriter(output);

        List<String> strings = Files.readAllLines(Path.of(input));
        int counter = 0;
        for (String string : strings) {
            counter++;
            writer.print(counter+". "+string+System.lineSeparator());

        }

        writer.close();

    }
}
