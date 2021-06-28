package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class FightCommand extends Command {
    public FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws InvocationTargetException, IllegalAccessException {
        return this.fightCommand(this.getData());
    }

    private String fightCommand(String[] data) {
        return "fight";
    }
}
