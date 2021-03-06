package com.coolweather.xuyuexiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xuyuexiang on 2020/9/26.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
