package com.spring.weather.constants;

import org.springframework.beans.factory.annotation.Value;

public class Constants {
    public static String API_URL;

    @Value("${weather-stack.api-url}")
    private void setApiUrl(String API_URL) {
        API_URL = API_URL;
    }
}
