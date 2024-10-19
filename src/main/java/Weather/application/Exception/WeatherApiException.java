package Weather.application.Exception;

import org.springframework.http.HttpStatus;

public class WeatherApiException extends RuntimeException{
    private final org.springframework.http.HttpStatus HttpStatus;

    public WeatherApiException(String message, HttpStatus HttpStatus){
        super(message);
        this.HttpStatus=HttpStatus;
    }

    public HttpStatus getHttpStatus() {
        return HttpStatus;
    }
}
