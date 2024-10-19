package Weather.application.Service.Impl;

import Weather.application.Exception.MinimumDaysException;
import Weather.application.Exception.MoreDaysException;
import Weather.application.Model.*;
import Weather.application.Service.ServiceInterface;
import Weather.application.UseFullclass.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {

    private static Logger logger= LoggerFactory.getLogger(ServiceImpl.class);

    @Autowired
    private Response response;


    @Override
    public FullResponse getfullRespone(String key, String q, Integer days) {
        logger.info("Entering into the service method for gettingfullresponsemethod");
        return response.getfullRespone(key,q,days);
    }    @Override
    public Location getLocation(String key, String location, Integer days) {
        logger.info("entering into the Service method of Location");
        FullResponse fullResponse=response.getfullRespone(key, location, days);
        logger.info("Successfully extracted the data from full response");
        return fullResponse.getLocation();
    }

    @Override
    public Current getCurrentWeatherDeatios(String key, String location, Integer days) {
        logger.info("entering into the getCurrentWeatherDeatios method");
        FullResponse fullResponse=response.getfullRespone(key, location, days);
        logger.info("successfully completed the getCurrentWeatherDeatios method");
        return fullResponse.getCurrent();
    }

    @Override
    public Forecast getForcastedetails(String key, String location, Integer days) {
        logger.info("Successfully entered into the getForcastedetails method");
        FullResponse fullResponse=response.getfullRespone(key, location, days);
        logger.info("successfully completed the getForcastedetails method");
        return fullResponse.getForecast();
    }

    @Override
    public ExtractedData getextracteddata(String key, String location, Integer days) {
        logger.info("entered the getextracteddata method");
        FullResponse fullResponse= response.getfullRespone(key,location,days);
        Location details=fullResponse.getLocation();
        Current current=fullResponse.getCurrent();

        logger.info("Loaded the Current and Location details");

        ExtractedData extractedData = new ExtractedData();

        logger.info("Extracted variable created");
        extractedData.setName(details.getName());
        extractedData.setCountry(details.getCountry());
        extractedData.setLocaldate(Response.setLocalDate(details.getLocaltime()));
        extractedData.setLocaltime(Response.setLocalTime(details.getLocaltime()));
        extractedData.setWeather(current.getCondition().getText());
        extractedData.setTempc(current.gettempc());
        extractedData.setHumidity(current.getHumidity());
        extractedData.setHeatindexc(current.getheatindexc());
        extractedData.setDewpointc(current.getdewpointc());
        extractedData.setGust_kph(current.getGust_kph());

        logger.info("successfully extracted the data");

        return extractedData;
    }
}
