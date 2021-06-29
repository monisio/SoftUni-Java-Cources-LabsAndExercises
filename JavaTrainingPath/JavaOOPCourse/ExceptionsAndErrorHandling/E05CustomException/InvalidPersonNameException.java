package JavaOOPCourse.ExceptionsAndErrorHandling.E05CustomException;

public class InvalidPersonNameException extends RuntimeException {

    public InvalidPersonNameException(){
        super();
    }

    public InvalidPersonNameException(String message) {
        super(message);
    }
}
