package JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction;

public abstract class Logger {

    protected Appender appender;

    protected Logger(Appender appender) {
        this.appender = appender;
    }

   public abstract void logError(String date, String message);

   public abstract void logInfo(String date, String message);

   public abstract void logWarning(String date, String message);
}
