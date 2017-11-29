package com.example.caleal.testaltran.service;

import com.example.caleal.testaltran.service.constans.ClassConstans;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CALEAL on 11/27/2017.
 */

public class ServiceHelper {

    private ServiceInterface serviceInterface;
    private Retrofit mRetrofit;
    public static ServiceHelper mInstance;

    public ServiceHelper() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(ClassConstans.URL_ENDPOINT)
                .build();
        serviceInterface = mRetrofit.create(ServiceInterface.class);

    }


    public static ServiceInterface getInstance(){
        if(mInstance == null)
            mInstance = new ServiceHelper();
        return mInstance.serviceInterface;
    }

}
