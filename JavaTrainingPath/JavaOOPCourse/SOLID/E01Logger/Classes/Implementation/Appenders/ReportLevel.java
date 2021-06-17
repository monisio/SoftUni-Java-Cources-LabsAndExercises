package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import java.util.Arrays;
import java.util.List;

public enum ReportLevel {
    INFO("INFO","WARNING","ERROR","CRITICAL","FATAL"),
    WARNING( "WARNING","ERROR","CRITICAL","FATAL"),
    ERROR("ERROR","CRITICAL","FATAL"),
    CRITICAL("CRITICAL","FATAL"),
    FATAL("FATAL");

    List<String>levels;
    ReportLevel(String...levels){
        this.levels=Arrays.asList(levels);
    }

   public List<String> getLevels(){
        return this.levels;
    }
}
