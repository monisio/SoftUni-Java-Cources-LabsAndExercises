package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class E08GetFolderSize {
    public static void main(String[] args) throws IOException {


            File file = new File("src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources");

        Deque<File> directory = new ArrayDeque<>();


        directory.addAll(Arrays.asList(file.listFiles()));

        long size = 0;

        while (!directory.isEmpty()){

            if (directory.peek().isFile()){
               size += directory.poll().length();
            }else{
                directory.addAll(Arrays.asList(directory.poll().listFiles()));
            }

        }


        System.out.println(size);



    }
}
