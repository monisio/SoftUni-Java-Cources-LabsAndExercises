package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.factories;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Unit;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		// TODO: implement for problem 3
		throw new ExecutionControl.NotImplementedException("message");
	}
}
