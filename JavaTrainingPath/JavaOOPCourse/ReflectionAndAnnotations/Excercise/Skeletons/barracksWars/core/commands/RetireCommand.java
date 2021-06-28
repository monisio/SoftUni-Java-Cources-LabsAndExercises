package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Inject;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;

public class RetireCommand extends Command {
    @Inject
    private Repository repository;

    public RetireCommand(String[] data){
        super(data);
    }

    public RetireCommand(String[] data, Repository repository) {
        super(data);
        this.repository= repository;
    }

    @Override
    public String execute()  {
        String unitType = this.getData()[1];
        try{
            this.repository.removeUnit(unitType);
            return unitType+" retired!";
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
