package com.example.stevenperegrine.simba_cardemo


import okhttp3.*
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Multipart
import org.web3j.abi.datatypes.Utf8String
import retrofit2.http.Headers


interface Methods {
    //Get Ethereum Balance on the rinkeby test net
    @GET
    fun bal(@Url url: String): Call<Models.Balance>

    //Get Register Car with no filtered search
    @Headers("APIKEY: b4e8b563b9ebcaaed9f18dfcea08365da24e0c1d1cecf1358016f096b851f7c3")
    @GET("registerCar/")
    fun getCar(): Call<Models.GetCars>

    //Get Register Car with filtered search
    @Headers("APIKEY: b4e8b563b9ebcaaed9f18dfcea08365da24e0c1d1cecf1358016f096b851f7c3")
    @GET
    fun getCarFiltered(@Url url: String): Call<Models.GetCars>

    //Get the Car Image
    @Headers("APIKEY: b4e8b563b9ebcaaed9f18dfcea08365da24e0c1d1cecf1358016f096b851f7c3")
    @GET
    fun getCarImage(@Url url: String): Call<Models.GetImage>

    //Posting to Register Car No Image
    @Headers("APIKEY: b4e8b563b9ebcaaed9f18dfcea08365da24e0c1d1cecf1358016f096b851f7c3")
    @FormUrlEncoded
    @POST("registerCar/")
    fun postCar(@Field("Make") Make: Utf8String, @Field("Model") Model: Utf8String, @Field("VIN") VIN: Utf8String, @Field("from") from: Utf8String): Call<Models.PostCar>

    //Sign Data
    @Headers("APIKEY: b4e8b563b9ebcaaed9f18dfcea08365da24e0c1d1cecf1358016f096b851f7c3")
    @POST()
    fun postsigneddata(@Url url:String, @Body signedData: Models.SignedData): Call<Models.SignedData>





}