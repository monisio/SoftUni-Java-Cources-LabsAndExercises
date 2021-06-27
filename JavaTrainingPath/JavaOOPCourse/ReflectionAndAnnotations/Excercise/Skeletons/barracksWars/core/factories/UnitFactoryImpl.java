package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.factories;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Unit;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		Unit unit =null;
		String unitClassPath = UNITS_PACKAGE_NAME + unitType;
		try {
			Class<?> aClass = Class.forName(unitClassPath);
			unit  = (Unit) aClass.getConstructor().newInstance();

		} catch (ClassNotFoundException
				| NoSuchMethodException
				| InvocationTargetException
				| InstantiationException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		// TODO: implement for problem 3

		if(unit!= null){
			return unit;
		}

		throw new ExecutionControl.NotImplementedException("message");
	}
}
