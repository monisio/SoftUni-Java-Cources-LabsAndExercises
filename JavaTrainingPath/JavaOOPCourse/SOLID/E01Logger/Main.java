package JavaOOPCourse.SOLID.E01Logger;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.ConsoleAppender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.FileAppender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders.ReportLevel;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.Layout;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.SimpleLayout;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.XmlLayout;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers.Controller;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Loggers.MessageLogger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



        Appender[] appenders= new Appender[n];

        for (int i = 0; i < n; i++) {

            String [] appenderInfo = scanner.nextLine().split("\\s+");
            String appenderType = appenderInfo[0];
            String layoutType = appenderInfo[1];

            Layout layout = getLayout(layoutType);
            Appender appender;


            if(appenderInfo.length!=2){
                String reportLevel = appenderInfo[2];

                appender= getAppender(appenderType , layout, reportLevel);

            }else{
              appender = getAppender(appenderType ,layout);
            }


            appenders[i]= appender;


        }

        Controller controller = new MessageLogger(appenders);

        String input = scanner.nextLine();

        while(!input.equals("END")){

            controller.inputLog(input);


            input= scanner.nextLine();
        }



    }

    private static Appender getAppender(String appenderType, Layout layout) {
         if(appenderType.equals("FileAppender")){
           return   new FileAppender(layout);
         }

         return new ConsoleAppender(layout);
    }

    private static Appender getAppender(String appenderType, Layout layout , String thresholdLevel){

        Appender appender= getAppender(appenderType,layout);
        appender.setReportLevel(ReportLevel.valueOf(thresholdLevel));

        return appender;
    }

    private static Layout getLayout(String layoutType) {

        if(layoutType.equals("XmlLayout")){
            return new XmlLayout();
        }

        return new SimpleLayout();
    }
}
