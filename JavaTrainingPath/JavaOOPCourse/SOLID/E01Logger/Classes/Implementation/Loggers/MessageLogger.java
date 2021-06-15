package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers;

import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Logger;

public class MessageLogger extends Logger {

    public MessageLogger(Appender appender) {
        super(appender);
    }

    @Override
   public   void logError(String date, String message) {
        this.appender.append(date, message, "ERROR");
    }

    @Override
   public void logInfo(String date, String message) {
        this.appender.append(date, message, "INFO");
    }

    @Override
   public void logWarning(String date, String message) {
        this.appender.append(date, message, "WARNING");
    }


}
