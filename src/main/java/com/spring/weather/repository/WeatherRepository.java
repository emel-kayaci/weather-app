package com.spring.weather.repository;

import com.spring.weather.model.WeatherEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WeatherRepository extends JpaRepository<WeatherEntity, String> {
    Optional<WeatherEntity> findFirstByRequestedCityNameOrderByUpdatedTime(String city);
}
