package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public interface Executable {

	String execute() throws InvocationTargetException, IllegalAccessException, ExecutionControl.NotImplementedException;

}
