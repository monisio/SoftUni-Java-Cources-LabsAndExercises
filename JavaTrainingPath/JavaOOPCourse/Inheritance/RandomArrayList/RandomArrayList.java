package JavaOOPCourse.Inheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    static Random RANDOM = new Random();

    public Object getRandomElement(){
        int index = RANDOM.nextInt(super.size());
        return super.remove(index);

    }

}
