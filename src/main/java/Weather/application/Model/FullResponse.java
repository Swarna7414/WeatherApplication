package Weather.application.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FullResponse {

    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;
    @JsonProperty("forecast")
    private  Forecast forecast;

}
