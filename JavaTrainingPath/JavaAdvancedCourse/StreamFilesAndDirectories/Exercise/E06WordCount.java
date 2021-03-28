package JavaAdvancedCourse.StreamFilesAndDirectories.Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class E06WordCount {
    public static void main(String[] args) throws IOException {
        String lookUpWords = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/words.txt";

        Map<String, Integer> countTable = new LinkedHashMap<>();

        Arrays.stream(Files.readString(Path.of(lookUpWords)).split(" ")).forEach(e -> countTable.putIfAbsent(e, 0));

        List<String> strings = Files.readAllLines(Path.of("src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/text.txt"));


        for (String string : strings) {
            Arrays.stream(string.split(" ")).forEach(e-> {
                if( countTable.containsKey(e.toLowerCase())){
                    Integer currentCount = countTable.get(e);
                    countTable.put(e,currentCount+1);
                }
            } );

        }

        PrintWriter writer = new PrintWriter("src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/textOutput.txt");

        countTable.forEach((key, value) -> writer.println(key + " - " + value));

        writer.close();
    }

}
