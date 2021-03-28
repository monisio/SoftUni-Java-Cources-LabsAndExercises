package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.*;

public class E09CopyPictureUsingBytes {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\35988\\Desktop\\Moni\\copySamplePicture.jpg");
             FileOutputStream outputStream = new FileOutputStream("C:\\Users\\35988\\Desktop\\Moni\\SamplePictureCopy.jpg")) {
            byte[] bytes = inputStream.readAllBytes();
            outputStream.write(bytes);

        }


    }
}
