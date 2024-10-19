package Weather.application.Exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmptyExceptionTest {

    @Test
    public void testexection(){
        EmptyException emptyException=new EmptyException("Exception occred");
    }

}