package JavaOOPCourse.ReflectionAndAnnotations.Lab.E04Annotations;

import JavaOOPCourse.ReflectionAndAnnotations.Lab.Reflection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Subject annotation = TestClass.class.getAnnotation(Subject.class);
        String[] categories = annotation.categories();

        Arrays.stream(annotation.categories()).forEach(System.out::println);

        Tracker.printMethodByAuthor(Reflection.class, "Moni");

    }


}

