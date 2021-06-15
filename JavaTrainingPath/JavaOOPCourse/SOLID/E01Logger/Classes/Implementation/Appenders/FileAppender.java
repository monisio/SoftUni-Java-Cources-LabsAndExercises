package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;

import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Appender;
import JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction.Layout;

import java.io.File;

public class FileAppender extends Appender {

    private File file;

    public FileAppender(Layout layout) {
        super(layout);
    }

    public void setFile(File file){
        this.file=file;
    }

    @Override
    public void append(String date, String message, String level) {

    }
}
