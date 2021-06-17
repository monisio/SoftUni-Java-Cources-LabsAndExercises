package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.Layout;

public abstract class BaseAppender implements Appender {

    protected Layout layout;

    private ReportLevel reportLevel;

    protected BaseAppender(Layout layout) {
        this.layout = layout;
        reportLevel = ReportLevel.INFO;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
         this.reportLevel=reportLevel;
    }

    protected boolean checkReportLevelApplicable(String type){
        return reportLevel.getLevels().contains(type);
    }

}
