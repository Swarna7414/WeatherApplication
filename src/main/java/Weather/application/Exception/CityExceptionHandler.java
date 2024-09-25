package Weather.application.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CityExceptionHandler {
    @ExceptionHandler(value = CityNotFoundException.class)
    public ResponseEntity<Object> exceptonhandler(CityNotFoundException cityNotFoundException){
        CityException cityException = new CityException(
                cityNotFoundException.getMessage(),
                cityNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cityNotFoundException,HttpStatus.NOT_FOUND);
    }

}
