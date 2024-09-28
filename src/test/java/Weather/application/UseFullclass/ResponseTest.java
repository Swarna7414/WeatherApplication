package Weather.application.UseFullclass;

import Weather.application.Exception.MinimumDaysException;
import Weather.application.Exception.MoreDaysException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ResponseTest {

    @InjectMocks
    private Response response;

    private String key;


    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(response,"max",7);
        ReflectionTestUtils.setField(response,"min",0);
        key="1497ada8dc73490586f125605241909";
    }

    @Test
    public void testgetfullResponeMINE(){
        MinimumDaysException exception=assertThrows(MinimumDaysException.class,()->{
            response.getfullRespone(key,"Somelocaton",0);
        });

        assertEquals("You Must Request for atlest one day",exception.getMessage());
    }

    @Test
    public void testgetfullResponeMaxE(){
        MoreDaysException exception=assertThrows(MoreDaysException.class,()->{
            response.getfullRespone(key,"Somelocaton",9);
        });

        assertEquals("Predection above 9 are not possible"+"Only 7 days of Forecast is Possible",exception.getMessage());
    }

    @Test
    public void testsetLocaldate(){
        String result=Response.setLocalDate("2004-12-12");
        assertEquals("12-12-2004",result);
    }

    @Test
    public void testLocaltime(){
        String result=Response.setLocalTime("14:32");
    }


}