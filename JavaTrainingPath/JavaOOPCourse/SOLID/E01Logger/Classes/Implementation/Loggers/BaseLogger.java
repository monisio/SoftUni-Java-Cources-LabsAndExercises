package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.Appender;

public abstract class BaseLogger implements Logger {

    Appender [] appenders;

    protected BaseLogger(Appender...appenders) {
        this.appenders = appenders;

    }


}
