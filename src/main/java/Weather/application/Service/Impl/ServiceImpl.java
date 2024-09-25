package Weather.application.Service.Impl;

import Weather.application.Model.Current;
import Weather.application.Model.Forecast;
import Weather.application.Model.FullResponse;
import Weather.application.Model.Location;
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
}
