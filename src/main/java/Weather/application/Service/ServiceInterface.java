package Weather.application.Service;

import Weather.application.Model.Current;
import Weather.application.Model.Forecast;
import Weather.application.Model.FullResponse;
import Weather.application.Model.Location;

public interface ServiceInterface {
    public FullResponse getfullRespone(String key,String q, Integer days);

    public Location getLocation(String key, String location, Integer days);

    public Current getCurrentWeatherDeatios(String key, String location, Integer days);

    public Forecast getForcastedetails(String key, String location, Integer days);
}
