package JavaAdvancedCourse.StreamFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class E02WriteToFile {
    public static void main(String[] args) throws IOException {



        String path = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\input";
        String outputPath = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\output.txt";

        FileInputStream fis = new FileInputStream(path); // стрийм на файла в програмата
        FileOutputStream fos = new FileOutputStream(outputPath); // изходящ стрийм към хард диска.

        InputStreamReader input = new InputStreamReader(fis); // четец на файла

       List<Character> lookUpTable = List.of(',', '.', '!', '?');

        int oneByte = input.read();
        while (oneByte > -1 ){

            if(!lookUpTable.contains((char)oneByte)){ // трябва байт информацията да бъде превърната в char преди проверката иначе
                                                      // ще търси инт стойност в листа.

                fos.write(oneByte);

            }

            oneByte= input.read();
        }


    }
}
