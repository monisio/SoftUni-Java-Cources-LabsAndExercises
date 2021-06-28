package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Unit;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class AddCommand extends Command{


    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }


    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        return this.addUnitCommand(this.getData());
    }

    private String addUnitCommand(String[] data) throws ExecutionControl.NotImplementedException {
        String unitType = data[1];
        Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
        this. getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
