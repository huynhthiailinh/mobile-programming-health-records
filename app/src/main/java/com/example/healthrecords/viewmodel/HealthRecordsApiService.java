package com.example.healthrecords.viewmodel;

import com.example.healthrecords.model.HealthRecord;

import java.util.List;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import io.reactivex.rxjava3.core.Single;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HealthRecordsApiService {
    private static final String BASE_URL = "https://raw.githubusercontent.com/";
    private HealthRecordsApi api;

    public HealthRecordsApiService() {
        api = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
                .create(HealthRecordsApi.class);
    }

    public Single<List<HealthRecord>> getHealthRecords() {
        return api.getHealthRecords();
    }
}
