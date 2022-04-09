package com.example.healthrecords.viewmodel;

import com.example.healthrecords.model.HealthRecord;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface HealthRecordsApi {
    @GET("TranNhuTri/data/main/infor.json")
    Single<List<HealthRecord>> getHealthRecords();
}
