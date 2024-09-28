package Weather.application.Exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class GlobalExceptionHandlerTest {

    @Mock
    private MoreDaysException moreDaysException;

    @Mock
    private MinimumDaysException minimumDaysException;

    @Mock
    private WeatherApiException weatherApiException;

    @InjectMocks
    private GlobalExceptionHandler globalExceptionHandler;

    @BeforeEach
    void setUp() {
        lenient().when(moreDaysException.getMessage()).thenReturn("Moredays");
        lenient().when(minimumDaysException.getMessage()).thenReturn("Lessdays");
        lenient().when(weatherApiException.getMessage()).thenReturn("WeatherAPI");
    }

    @Test
    public void testhandlemoredays(){
        globalExceptionHandler.handlelessdaysexcepion(minimumDaysException);
        globalExceptionHandler.handlemoredaysexception(moreDaysException);
        globalExceptionHandler.handlescitynotfondexception(weatherApiException);
    }
}