package Weather.application.Service;

import Weather.application.Model.FullResponse;

public interface ServiceInterface {
    public FullResponse getfullRespone(String key,String q, Integer days);
}
