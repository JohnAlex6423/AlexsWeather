package com.example.alexsweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LaoZhao on 2017/12/10.
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
