package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts;

public class SimpleLayout implements Layout {

    @Override
    public String format(String date, String message, String reportLevel) {
        return String.format("%s - %s - %s", date, reportLevel,message);
    }
}
