package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.Layout;

public class ConsoleAppender extends BaseAppender {


    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String date, String message, String level) {
       if( checkReportLevelApplicable(level)){
           String formatMessage = layout.format(date, message, level);
           System.out.println(formatMessage);
       }
    }




}
