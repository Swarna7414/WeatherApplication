package Weather.application.UseFullclass;

import Weather.application.Model.FullResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class Response {

    @Autowired
    private WebClient.Builder webclient;
    public FullResponse getfullRespone(String key, String location, Integer days) {
        Mono<FullResponse> fullResponseMono = webclient.build().get()
                .uri(uriBuilder -> uriBuilder.scheme("https")
                        .host("api.weatherapi.com")
                        .path("/v1/forecast.json")
                        .queryParam("key",key)
                        .queryParam("q",location)
                        .queryParam("days",days)
                        .build()).header("Accept","MediaType.APPLICATION_JSON_VALUE")
                .retrieve().bodyToMono(FullResponse.class);

        return fullResponseMono.block();
    }

}
