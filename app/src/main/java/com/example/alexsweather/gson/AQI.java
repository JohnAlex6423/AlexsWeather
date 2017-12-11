package com.example.alexsweather.gson;

/**
 * Created by LaoZhao on 2017/12/10.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
