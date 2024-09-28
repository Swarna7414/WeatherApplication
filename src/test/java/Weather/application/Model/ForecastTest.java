package Weather.application.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForecastTest {

    Day day=new Day(56.6,59.6,12.2,50);

    @Test
    public void GettersandSetters(){
        ForecastDay forecastDay=new ForecastDay("12-12",day);
        ForecastDay forecastDay1= new ForecastDay();
        forecastDay1.setDay(day);
        forecastDay1.setDate("12-12-12");

        forecastDay1.getDay();
        forecastDay1.getDate();

        List<ForecastDay> list=new ArrayList<>();

        list.add(forecastDay);
        list.add(forecastDay1);

        Forecast forecast1=new Forecast();
        Forecast forecast=new Forecast(list);

        forecast.setForecastday(list);
        forecast.getForecastday();
    }
}