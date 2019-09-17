package com.temper.assessment.api;

import com.temper.assessment.model.job.JobResponse;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("contractor/shifts?interests=5,7,8,9,10,12,13,14,19,21,2 3,24,26&distance=%7B%22range%22:50,%22geolocation%22:%7B%22lat%22:%2252.360537%22,% 22lng%22:%224.993292%22%7D%7D&dates=2019-10-01,2019-10-10")
    Single<JobResponse> getJobList();
}
