package com.example.alexsweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LaoZhao on 2017/12/10.
 */

public class Weather {

    public String status;

    public AQI aqi;

    public Basic basic;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
