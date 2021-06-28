package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        BlackBoxInt blackBoxInt = constructor.newInstance();

        String input = scanner.nextLine();

       while (!input.equals("END")){
            String[] tokens = input.split("_");

            // method is extracted from Class object then invoked  on instance of the class.
           Method declaredMethod = clazz.getDeclaredMethod(tokens[0],int.class);
           declaredMethod.setAccessible(true);
           declaredMethod.invoke(blackBoxInt , Integer.parseInt(tokens[1]));


           // we have to take field from existing object , then change access level and get the value.
           Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
           innerValue.setAccessible(true);

           System.out.println(innerValue.get(blackBoxInt));

           input = scanner.nextLine();
       }


    }
}
