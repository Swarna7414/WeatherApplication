package Weather.application.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayTest {

    @Test
    public void testGettersandSetters(){
        Day day=new Day();
        Day day1=new Day(56.6,59.6,12.2,50);
        day.setavgtempc(20.2);
        day.setmaxtempc(55);
        day.setmintempc(20);
        day.setAvghumidity(20);


        day.getavgtempc();
        day.getmaxtempc();
        day.getmintempc();
        day.getAvghumidity();

    }

}