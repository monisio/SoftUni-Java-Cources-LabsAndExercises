package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Files;

public class LogFile implements File{

    StringBuilder logFile;

    public LogFile(){
        this.logFile = new StringBuilder();
    }

    @Override
    public void write(String message) {

        logFile.append(message);
    }

    @Override
    public int getSize() {
       return logFile.chars().sum();
    }

}
