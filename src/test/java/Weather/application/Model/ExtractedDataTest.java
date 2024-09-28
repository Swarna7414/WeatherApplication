package Weather.application.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExtractedDataTest {

    @Test
    public void GettersandSetters(){
        ExtractedData extractedData= new ExtractedData("Swarna","India","12-2-54","12.56","Sunny",50.3,566,56.2,25.6,65.2);
        ExtractedData extractedData1= new ExtractedData();

        extractedData1.setName("Swarna");
        extractedData1.setCountry("India");
        extractedData1.setLocaldate("12-15-13");
        extractedData1.setLocaltime("15.23");
        extractedData1.setWeather("Cloudy");
        extractedData1.setTempc(56.6);
        extractedData1.setHumidity(50);
        extractedData1.setHeatindexc(50.6);
        extractedData1.setDewpointc(56.3);
        extractedData1.setGust_kph(50.66);


        extractedData1.getName();
        extractedData1.getCountry();
        extractedData1.getLocaldate();
        extractedData1.getLocaltime();
        extractedData1.getWeather();
        extractedData1.getTempc();
        extractedData1.getHumidity();
        extractedData1.getHeatindexc();
        extractedData1.getDewpointc();
        extractedData1.getGust_kph();

    }

}