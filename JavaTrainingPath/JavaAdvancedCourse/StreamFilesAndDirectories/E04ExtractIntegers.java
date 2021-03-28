package JavaAdvancedCourse.StreamFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\input";
        String outputPath = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\output.txt";

        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(outputPath);

        Scanner scanner = new Scanner(fis);

        try{

            while (scanner.hasNext()) {

                if(scanner.hasNextInt()){
                    System.out.println(scanner.nextInt());
                }

                scanner.next();
            }

        }finally {
            fis.close();
            fos.close();
            scanner.close();
        }

    }
}
