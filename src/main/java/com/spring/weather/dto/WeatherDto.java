package com.spring.weather.dto;

public record WeatherDto(
        String cityName,
        String country,
        Integer temperature)
{ }
