package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class ReportCommand extends Command{


    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws InvocationTargetException, IllegalAccessException {
        return this.reportCommand(this.getData());
    }

    private String reportCommand(String[] data) {
        String output = this.getRepository().getStatistics();
        return output;
    }



}
