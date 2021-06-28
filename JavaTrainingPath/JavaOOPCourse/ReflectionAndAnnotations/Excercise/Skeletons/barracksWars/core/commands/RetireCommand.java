package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;

public class RetireCommand extends Command {

    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute()  {
        String unitType = this.getData()[1];
        try{
            this.getRepository().removeUnit(unitType);
            return unitType+" retired!";
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
