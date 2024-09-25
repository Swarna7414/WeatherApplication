package Weather.application.Controller;

import Weather.application.Model.*;
import Weather.application.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private ServiceInterface service;

    @GetMapping(value = "/fulldata",produces = MediaType.APPLICATION_JSON_VALUE)
    private FullResponse getResponse(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        return service.getfullRespone(key, location, days);
    }

    @GetMapping(value = "/location", produces = "application/json")
    private Location getLocation(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        return service.getLocation(key, location, days);
    }

    @GetMapping(value = "/current", produces = "application/json")
    private Current getcurrent(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        return service.getCurrentWeatherDeatios(key, location, days);
    }

    @GetMapping(value = "/forecast", produces = "application/json")
    private Forecast getForecasteddata(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        return service.getForcastedetails(key, location, days);
    }

    @GetMapping("/required")
    public ExtractedData getExtratedData(@RequestParam String key, @RequestParam String location, @RequestParam Integer days){
        return service.getextracteddata(key,location,days);
    }


}
