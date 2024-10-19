package Weather.application.Exception;

public class MoreDaysException extends RuntimeException {

    public MoreDaysException(String message){
        super(message);
    }
    public MoreDaysException(String message, Throwable cause){
        super(message, cause);
    }
}
