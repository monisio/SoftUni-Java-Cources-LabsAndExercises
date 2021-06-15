package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Layout;

public class ConsoleAppender extends Appender {


    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String date, String message, String level) {
        String formatMessage = layout.format(date, message, level);
        System.out.println(formatMessage);
    }


}
