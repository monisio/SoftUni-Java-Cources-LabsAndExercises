package JavaOOPCourse.SOLID.E01Logger;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.ConsoleAppender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.FileAppender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Files.File;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Files.LogFile;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.Layout;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.XmlLayout;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers.Logger;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers.MessageLogger;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new XmlLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);

        File file = new LogFile();
        Appender fileAppender = new FileAppender(simpleLayout);
        ((FileAppender) fileAppender).setFile(file);



        Logger logger = new MessageLogger(consoleAppender, fileAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");



    }
}
