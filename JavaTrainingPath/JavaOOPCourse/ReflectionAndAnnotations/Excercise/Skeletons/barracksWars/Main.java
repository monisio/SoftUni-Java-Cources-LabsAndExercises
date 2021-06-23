package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.Engine;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.factories.UnitFactoryImpl;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.data.UnitRepository;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Repository;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Runnable;
import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
