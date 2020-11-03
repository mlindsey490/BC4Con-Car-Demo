package com.example.stevenperegrine.simba_cardemo.PostClasses;




import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import com.example.stevenperegrine.simba_cardemo.Models;


public interface ApiClient {

    @Multipart
    @Headers("APIKEY: b4e8b563b9ebcaaed9f18dfcea08365da24e0c1d1cecf1358016f096b851f7c3")
    @POST("registerCar/")
    Call<Models.PostCar> uploadImage(@Part("Make") RequestBody make,
                                  @Part("Model") RequestBody model,
                                  @Part("VIN") RequestBody vin,
                                  @Part("from") RequestBody from,
                                  @Part MultipartBody.Part file);
}
