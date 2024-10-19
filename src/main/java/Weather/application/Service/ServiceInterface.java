package Weather.application.Service;

import Weather.application.Model.*;

public interface ServiceInterface {
    public FullResponse getfullRespone(String key,String q, Integer days);

    public Location getLocation(String key, String location, Integer days);

    public Current getCurrentWeatherDeatios(String key, String location, Integer days);

    public Forecast getForcastedetails(String key, String location, Integer days);

    public ExtractedData getextracteddata(String key, String location, Integer days);
}
