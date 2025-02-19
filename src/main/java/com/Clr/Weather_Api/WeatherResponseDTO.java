package com.Clr.Weather_Api;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResponseDTO {

    @JsonProperty("temperature")
    private String temperature;

    @JsonProperty("windspeed")
    private double windSpeed;

    @JsonProperty("weathercode")
    private int weatherCode;

    @JsonProperty("time")
    private String time;

    private String weatherDescription;
    private String weatherIcon;

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }
    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }
}
