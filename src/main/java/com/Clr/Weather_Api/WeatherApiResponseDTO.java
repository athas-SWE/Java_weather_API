package com.Clr.Weather_Api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherApiResponseDTO {

    @JsonProperty("current_weather")
    private WeatherResponseDTO currentWeather;

    public WeatherResponseDTO getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(WeatherResponseDTO currentWeather) {
        this.currentWeather = currentWeather;
    }
}
