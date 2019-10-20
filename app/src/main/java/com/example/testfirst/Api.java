package com.example.testfirst;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {

    String BASE_URL = "http://192.168.1.70/Drupal/newsportal/web/";

    @GET("api/articles")
//    @Headers({"Content-type: application/json"})
     Call<List<Hero>> getHeroes();

}
