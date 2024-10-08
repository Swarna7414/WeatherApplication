package Weather.application.UseFullclass;

import Weather.application.Exception.EmptyException;
import Weather.application.Exception.MinimumDaysException;
import Weather.application.Exception.MoreDaysException;
import Weather.application.Exception.WeatherApiException;
import Weather.application.Model.FullResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class Response {

    @Autowired
    private WebClient.Builder webclient;

    private static Logger logger= LoggerFactory.getLogger(Response.class);

    @Value("${max.days}")
    private int max;

    @Value("${min.days}")
    private int min;

    public FullResponse getfullRespone(String key, String location, Integer days) {

        logger.info("Entering into the Full response method");

        if((location==null || location.trim().isEmpty()) && (days==null|| days < 1)){
            logger.error("Requested parameters was empty");
            throw new EmptyException("Location or Days is an Empty value please try again");
        }
        if(days==min){
            logger.error("shortage of days");
            throw new MinimumDaysException("You Must Request for atlest one day");
        }
        if (days>max){
            logger.error("more days given");
            throw new MoreDaysException("Predection above "+days+" are not possible"+"Only 7 days of Forecast is Possible");
        }
        logger.info("getting the response from the Webclient");
        Mono<FullResponse> fullResponseMono = webclient.build().get()
                .uri(uriBuilder -> uriBuilder.scheme("https")
                        .host("api.weatherapi.com")
                        .path("/v1/forecast.json")
                        .queryParam("key",key)
                        .queryParam("q",location)
                        .queryParam("days",days)
                        .build()).header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .onStatus(status->status.is4xxClientError(),clientResponse -> {
                    return clientResponse.bodyToMono(String.class).flatMap(errorresponse->{
                        throw new WeatherApiException("City Not Found",HttpStatus.NOT_FOUND);
                    });
                })
                .onStatus(status-> status.is5xxServerError(),clientResponse -> {
                    return clientResponse.bodyToMono(String.class).flatMap(errorresponse->{
                        throw new WeatherApiException("Internal Server Error. Please try again later.",HttpStatus.INTERNAL_SERVER_ERROR);
                    });
                })
                .bodyToMono(FullResponse.class);

        logger.info("Successfully extracted the response from the external website");

        return fullResponseMono.block();
    }

    public static String setLocalDate(String localdate){
        logger.info("Entering into the setLocalDate method");
        String datepart=localdate.substring(0,10);
        String[] date=datepart.split("-");
        List<String> dates = Arrays.asList(date);
        Collections.reverse(dates);
        StringBuilder realdate = new StringBuilder();
        for(int i=0; i<dates.size(); i++){
            realdate.append(dates.get(i));
            if(i<dates.size()-1){
                realdate.append("-");
            }
        }
        logger.info("Date conversion done");
        return realdate.toString();
    }

    public static String setLocalTime(String localdate){
        logger.info("Entering into the Local date method");
        String timepart=localdate.substring(localdate.length()-5);
        LocalTime time = LocalTime.parse(timepart);
        DateTimeFormatter realtime = DateTimeFormatter.ofPattern("hh:mm a");
        logger.info("Successfully Extracted the time");
        return time.format(realtime);
    }

}
