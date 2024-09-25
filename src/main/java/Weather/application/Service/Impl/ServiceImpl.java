package Weather.application.Service.Impl;

import Weather.application.Model.FullResponse;
import Weather.application.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServiceImpl implements ServiceInterface {

    @Autowired
    private WebClient.Builder webclient;

    @Override
    public FullResponse getfullRespone(String key,String location,Integer days) {
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
