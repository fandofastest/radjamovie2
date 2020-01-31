package com.filmapik.indoxxi.indoxxi_network.apis;

import com.filmapik.indoxxi.indoxxi_network.model.PasswordReset;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PassResetApi {


    @GET("password_reset")
    Call<PasswordReset> resetPassword(@Query("api_secret_key") String key,
                                      @Query("email") String email);

}
