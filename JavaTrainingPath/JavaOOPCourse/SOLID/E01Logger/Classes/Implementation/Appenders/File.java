package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Layout;

public abstract class File extends Appender {
    protected File(Layout layout) {
        super(layout);
    }
}
