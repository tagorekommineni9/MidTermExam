package com.example.exam;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataServices {

    @GET("3534")
    Call<Weather> getCompleteWeather();

}
