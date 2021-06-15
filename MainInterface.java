package com.example.pagingdemo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainInterface {
    @GET("/v2/list")
    Call<ArrayList<MainData>> STRING_CALL(@Query("page") int page,
                                          @Query("limit") int limit);
}
