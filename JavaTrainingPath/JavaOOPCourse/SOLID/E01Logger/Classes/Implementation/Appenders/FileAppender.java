package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Appenders;


import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Files.File;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Files.LogFile;
import JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts.Layout;

public class FileAppender extends BaseAppender{

   private File file;

    public FileAppender(Layout layout) {
        super(layout);
        file= new LogFile();
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void append(String date, String message, String type) {
        if(checkReportLevelApplicable(type)){
            String formatted = layout.format(date, message, type);
            file.write(formatted);
        }

    }


}
