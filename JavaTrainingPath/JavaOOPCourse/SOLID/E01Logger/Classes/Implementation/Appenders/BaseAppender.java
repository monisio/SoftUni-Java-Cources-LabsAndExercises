package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.Layout;

public abstract class BaseAppender implements Appender {

    protected Layout layout;

    protected BaseAppender(Layout layout) {
        this.layout = layout;
    }

}
