package Weather.application.Controller;

import Weather.application.Model.*;
import Weather.application.Service.ServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    private static Logger logger= LoggerFactory.getLogger(WeatherController.class);

    private String realkey= "1497ada8dc73490586f125605241909";

    private final ServiceInterface service;
    @Autowired
    public WeatherController(ServiceInterface service){
        this.service=service;
    }

    @GetMapping(value = "/fulldata",produces = MediaType.APPLICATION_JSON_VALUE)
    public FullResponse getResponse(@RequestParam String location, @RequestParam Integer days){
        logger.info("Entered into the full data");
        return service.getfullRespone(realkey, location, days);
    }

    @GetMapping(value = "/location", produces = "application/json")
    public Location getLocation(@RequestParam String location, @RequestParam Integer days){
        logger.info("entering into the Location");
        return service.getLocation(realkey, location, days);
    }

    @GetMapping(value = "/current", produces = "application/json")
    public Current getcurrent(@RequestParam String location, @RequestParam Integer days){
        logger.info("entering into the current controller method");
        return service.getCurrentWeatherDeatios(realkey, location, days);
    }

    @GetMapping(value = "/forecast", produces = "application/json")
    public Forecast getForecasteddata(@RequestParam String location, @RequestParam Integer days){
        logger.info("entering into the forecast method");
        return service.getForcastedetails(realkey, location, days);
    }

    @GetMapping("/required")
    public String getExtratedData(@RequestParam(required = false) String location, @RequestParam(required = false) Integer days, Model model){
        if(location==null || days == null){
            return "index";
        }
        ExtractedData data=service.getextracteddata(realkey,location,days);
        model.addAttribute("name",data.getName());
        model.addAttribute("country",data.getCountry());
        model.addAttribute("localdate",data.getLocaldate());
        model.addAttribute("localtime",data.getLocaltime());
        model.addAttribute("weather",data.getWeather());
        model.addAttribute("humidity",data.getHumidity());
        model.addAttribute("tempc",data.getTempc());
        model.addAttribute("heatindexc",data.getHeatindexc());
        model.addAttribute("dewpointc",data.getDewpointc());
        model.addAttribute("gust_kph",data.getGust_kph());
        return "result";
    }


}