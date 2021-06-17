package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.Appender;

public class MessageLogger extends BaseLogger {


    public MessageLogger(Appender... appenders) {
        super(appenders);
    }

    private void iterateLog(String date, String message, String type) {
        for (Appender appender : appenders) {
            appender.append(date, message, type);
        }
    }

    @Override
    public void logInfo(String date, String message) {
        iterateLog(date, message, "INFO");
    }

    @Override
    public void logWarning(String date, String message) {
        iterateLog(date, message, "WARNING");
    }

    @Override
    public void logError(String date, String message) {

        iterateLog(date, message, "ERROR");
    }

    @Override
    public void logCritical(String date, String message) {
        iterateLog(date, message, "CRITICAL");
    }

    @Override
    public void logFatal(String date, String message) {
        iterateLog(date, message, "FATAL");
    }


}
