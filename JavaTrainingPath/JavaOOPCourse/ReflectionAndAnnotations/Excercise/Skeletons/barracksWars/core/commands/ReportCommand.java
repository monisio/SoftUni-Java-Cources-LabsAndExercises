package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Inject;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;

import java.lang.reflect.InvocationTargetException;

public class ReportCommand extends Command{
    @Inject
   private Repository repository;

    public ReportCommand(String[]data){
        super(data);
    }

    public ReportCommand(String[] data, Repository repository) {
        super(data);
        this.repository = repository;
    }

    @Override
    public String execute() throws InvocationTargetException, IllegalAccessException {
        return this.reportCommand(this.getData());
    }

    private String reportCommand(String[] data) {
        return this.repository.getStatistics();
    }



}
