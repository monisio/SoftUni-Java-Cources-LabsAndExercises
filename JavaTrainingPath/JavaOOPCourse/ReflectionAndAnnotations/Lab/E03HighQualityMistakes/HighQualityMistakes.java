package JavaOOPCourse.ReflectionAndAnnotations.Lab.E03HighQualityMistakes;

import JavaOOPCourse.ReflectionAndAnnotations.Lab.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class HighQualityMistakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class clazz = Reflection.class;


        Field[] fields = clazz.getFields();

        Method[] getters = Arrays.stream(clazz.getMethods())
                .filter(method -> method.getName().contains("get"))
                .toArray(Method[]::new);
        Method[] setters = Arrays.stream(clazz.getMethods())
                .filter(method -> method.getName().contains("set"))
                .toArray(Method[]::new);


        Arrays.stream(fields)
                .filter(f-> !Modifier.isPrivate(f.getModifiers()))
                .forEach(field -> System.out.println( field.getName()+ " must be private!"));


        Arrays.stream(getters)
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .forEach(method -> System.out.println( method.getName() + " must be public!"));

        Arrays.stream(setters)
                .filter(method -> !Modifier.isPrivate(method.getModifiers()))
                .forEach(method -> System.out.println( method.getName() + " must be private!"));


    }
}
