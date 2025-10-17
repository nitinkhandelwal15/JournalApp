package com.nitinkhandelwal.JournalApp.service;

import com.nitinkhandelwal.JournalApp.api.response.WeatherResponse;
import com.nitinkhandelwal.JournalApp.cache.AppCache;
import com.nitinkhandelwal.JournalApp.constants.Placeholders;
import com.nitinkhandelwal.JournalApp.entity.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;
 //   private static final String API = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    public WeatherResponse getWeather(String city){
        String finalAPI = appCache.appCache.get(AppCache.keys.WEATHER_API.toString()).replace(Placeholders.CITY, city).replace(Placeholders.API_KEY, apiKey);

//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("key","value");
//
//        User user = User.builder().userName("nitin").password("nitin").build();
//
//        HttpEntity<User> httpEntity = new HttpEntity<>(user, httpHeaders);

        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }



}
