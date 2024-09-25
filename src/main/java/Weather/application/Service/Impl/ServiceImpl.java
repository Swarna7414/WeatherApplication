package Weather.application.Service.Impl;

import Weather.application.Model.*;
import Weather.application.Service.ServiceInterface;
import Weather.application.UseFullclass.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {

    @Autowired
    private Response response;

    @Override
    public FullResponse getfullRespone(String key, String q, Integer days) {
        return response.getfullRespone(key,q,days);
    }

    @Override
    public Location getLocation(String key, String location, Integer days) {
        FullResponse fullResponse=response.getfullRespone(key, location, days);
        return fullResponse.getLocation();
    }

    @Override
    public Current getCurrentWeatherDeatios(String key, String location, Integer days) {
        FullResponse fullResponse=response.getfullRespone(key, location, days);
        return fullResponse.getCurrent();
    }

    @Override
    public Forecast getForcastedetails(String key, String location, Integer days) {
        FullResponse fullResponse=response.getfullRespone(key, location, days);
        return fullResponse.getForecast();
    }

    @Override
    public ExtractedData getextracteddata(String key, String location, Integer days) {
        FullResponse fullResponse= response.getfullRespone(key,location,days);
        Location details=fullResponse.getLocation();
        Current current=fullResponse.getCurrent();

        ExtractedData extractedData = new ExtractedData();

        extractedData.setName(details.getName());
        extractedData.setCountry(details.getCountry());
        extractedData.setLocaltime(details.getLocaltime());
        extractedData.setWeather(current.getCondition().getText());
        extractedData.setTempc(current.gettempc());
        extractedData.setHumidity(current.getHumidity());
        extractedData.setHeatindexc(current.getheatindexc());
        extractedData.setDewpointc(current.getdewpointc());
        extractedData.setGust_kph(current.getGust_kph());

        return extractedData;
    }
}
