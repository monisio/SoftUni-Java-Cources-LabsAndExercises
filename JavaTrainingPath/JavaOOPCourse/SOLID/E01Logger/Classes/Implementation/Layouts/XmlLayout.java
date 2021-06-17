package JavaOOPCourse.SOLID.E01Logger.Classes.Implementation.Layouts;

public class XmlLayout implements Layout {
    @Override
    public String format(String dateInfo, String logInfo, String type) {
        char space = ' ';
        return String.format("<log>%n%-3s<date>%s<date>%n%-3s<type>%s<type>%n%-3s<message>%s<message>%n<log>", space, dateInfo, space, type, space, logInfo);
    }
}
