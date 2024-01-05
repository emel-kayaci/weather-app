package com.spring.weather.service;

import com.spring.weather.dto.WeatherDto;
import com.spring.weather.model.WeatherEntity;
import com.spring.weather.repository.WeatherRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;
    private final RestTemplate restTemplate;

    public WeatherService(WeatherRepository weatherRepository, RestTemplate restTemplate) {
        this.weatherRepository = weatherRepository;
        this.restTemplate = restTemplate;
    }


}
