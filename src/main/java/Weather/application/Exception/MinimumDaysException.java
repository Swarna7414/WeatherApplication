package Weather.application.Exception;

public class MinimumDaysException extends RuntimeException{
    public MinimumDaysException(String message){
        super(message);
    }
}
