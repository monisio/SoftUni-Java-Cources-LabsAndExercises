package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter {

    //This class is dependency inject container;

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {

        String commandFix = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1) + "Command";


        final String className = "JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands." + commandFix;

        Executable executableInstance = null;

        try {
            Class<?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getConstructor(String[].class);
            //Get the common parameter constructor;
            //Note that all commands can be initiated with constructor accepting dependencies;
            //But for this example we are injecting them.

            executableInstance = (Executable) constructor.newInstance(data);

            Field[] executableFields = clazz.getDeclaredFields();
            Field[] localFields = this.getClass().getDeclaredFields();

            for (Field executableField : executableFields) {
                //check if fields has inject annotation present

                if (executableField.isAnnotationPresent(Inject.class)) {

                    for (Field localField : localFields) {
                        if (executableField.getType().equals(localField.getType())) {
                            // we are injecting the instance with this. field
                            executableField.setAccessible(true);
                            executableField.set(executableInstance, localField.get(this));

                        }

                    }


                }
            }

        } catch (ClassNotFoundException
                | InvocationTargetException
                | NoSuchMethodException
                | InstantiationException
                | IllegalAccessException e) {

            throw new RuntimeException(e.getMessage());
        }


        return executableInstance;

    }


}
