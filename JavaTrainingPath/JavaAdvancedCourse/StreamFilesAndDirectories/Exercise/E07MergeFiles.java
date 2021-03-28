package JavaAdvancedCourse.StreamFilesAndDirectories.Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E07MergeFiles {
    public static void main(String[] args) throws IOException {



        List<String> stringsOne = Files.readAllLines(Path.of("src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/inputOne.txt"));
        stringsOne.addAll( Files.readAllLines(Path.of("src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/inputTwo.txt")));

        PrintWriter writer = new PrintWriter("src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/resultMerge.txt");

        for (String s : stringsOne) {
            writer.println(s);
        }

        writer.close();
    }
}

