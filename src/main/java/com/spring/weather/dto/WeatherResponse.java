package com.spring.weather.dto;

public record WeatherResponse(
        Request request,
        Location location,
        Current current
) {
}
