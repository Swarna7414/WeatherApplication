package Weather.application.Exception;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException(String message){
        super(message);
    }
    public CityNotFoundException(String message,Throwable cause){
        super(message,cause);
    }
}