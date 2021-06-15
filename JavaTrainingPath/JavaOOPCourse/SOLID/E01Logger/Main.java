package JavaOOPCourse.SOLID.E01Logger;

import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Layout;
import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Logger;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.ConsoleAppender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers.MessageLogger;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.SimpleLayout;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");


    }
}
