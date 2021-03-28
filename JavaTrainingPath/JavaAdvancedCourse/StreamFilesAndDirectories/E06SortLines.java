package JavaAdvancedCourse.StreamFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class E06SortLines {
    public static void main(String[] args) throws IOException {

        String input = "src/AdvancedJava/StreamFilesAndDirectories/input";
        String output = "src/AdvancedJava/StreamFilesAndDirectories/output.txt";
        List<String> list = Files.readAllLines(Path.of(input));

        Collections.sort(list);
        Files.write(Path.of(output),list);
       list.forEach(System.out::println);

         





     }
}
