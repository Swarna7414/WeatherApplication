package Weather.application.Controller;

import Weather.application.Model.*;
import Weather.application.Service.ServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private static Logger logger= LoggerFactory.getLogger(WeatherController.class);

    private final ServiceInterface service;
    @Autowired
    public WeatherController(ServiceInterface service){
        this.service=service;
    }

    @GetMapping(value = "/fulldata",produces = MediaType.APPLICATION_JSON_VALUE)
    public FullResponse getResponse(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        logger.info("Entered into the full data");
        return service.getfullRespone(key, location, days);
    }

    @GetMapping(value = "/location", produces = "application/json")
    public Location getLocation(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        logger.info("entering into the Location");
        return service.getLocation(key, location, days);
    }

    @GetMapping(value = "/current", produces = "application/json")
    public Current getcurrent(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        logger.info("entering into the current controller method");
        return service.getCurrentWeatherDeatios(key, location, days);
    }

    @GetMapping(value = "/forecast", produces = "application/json")
    public Forecast getForecasteddata(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        logger.info("entering into the forecast method");
        return service.getForcastedetails(key, location, days);
    }

    @GetMapping("/required")
    public ExtractedData getExtratedData(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        logger.info("Entering into the required details method");
        return service.getextracteddata(key,location,days);
    }


}
