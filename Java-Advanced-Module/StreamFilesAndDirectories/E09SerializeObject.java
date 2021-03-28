package AdvancedJava.StreamFilesAndDirectories;

import java.io.*;

public class E09SerializeObject {

    public static class Cube implements Serializable {

        String color;
        double width;
        double height;
        double depth;


        @Override
        public String toString() {
            return "Cube{" +
                    "color='" + color + '\'' +
                    ", width=" + width +
                    ", height=" + height +
                    ", depth=" + depth +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Cube cube = new Cube();

        cube.color = "green";
        cube.width = 15.3;
        cube.depth = 12.4;
        cube.height = 3;

        String path = "src/AdvancedJava/StreamFilesAndDirectories/objectSerialized.txt";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(cube);


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        Object deserialized = ois.readObject();

        System.out.println(deserialized.toString());

        oos.close();
        ois.close();

    }
}



