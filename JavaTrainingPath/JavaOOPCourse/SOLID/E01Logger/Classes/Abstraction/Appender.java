package JavaOOPCourse.SOLID.E01Logger.Classes.Abstraction;

public abstract class Appender {

    protected Layout layout;

    protected Appender(Layout layout) {
        this.layout = layout;
    }

    public abstract void append(String date, String message, String level);

}
