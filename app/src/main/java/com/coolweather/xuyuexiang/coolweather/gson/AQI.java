package com.coolweather.xuyuexiang.coolweather.gson;

/**
 * Created by xuyuexiang on 2020/9/26.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
