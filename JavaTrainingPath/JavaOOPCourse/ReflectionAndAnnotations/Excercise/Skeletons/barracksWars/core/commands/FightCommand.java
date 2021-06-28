package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import java.lang.reflect.InvocationTargetException;

public class FightCommand extends Command {

    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws InvocationTargetException, IllegalAccessException {
        return this.fightCommand(this.getData());
    }

    private String fightCommand(String[] data) {
        return "fight";
    }
}
