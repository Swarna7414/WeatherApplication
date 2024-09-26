package Weather.application.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MoreDaysException.class)
    public ResponseEntity<Object> handlemoredaysexception(MoreDaysException moreDaysException){
        ErrorResponse errorResponse= new ErrorResponse(
                moreDaysException.getMessage(),
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = MinimumDaysException.class)
    public ResponseEntity<Object> handlelessdaysexcepion(MinimumDaysException minimumDaysException){
        ErrorResponse errorResponse = new ErrorResponse(minimumDaysException.getMessage(),HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = EmptyException.class)
    public ResponseEntity<Object> handlesEmptyExxception(EmptyException emptyException){
        ErrorResponse errorResponse= new ErrorResponse(emptyException.getMessage(),HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
