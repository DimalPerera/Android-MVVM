package com.temper.assessment.repository;


import android.annotation.SuppressLint;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.temper.assessment.api.ApiInterface;
import com.temper.assessment.api.RetrofitService;
import com.temper.assessment.model.job.JobResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;


public class NetworkRepository {

    private static NetworkRepository networkRepository;
    private ApiInterface apiInterface;

    public NetworkRepository() {
        apiInterface = RetrofitService.getInstance().getService();
    }

    public static NetworkRepository getInstance() {
        if (networkRepository == null) {
            networkRepository = new NetworkRepository();
        }
        return networkRepository;
    }

    @SuppressLint("CheckResult")
    public MutableLiveData<JobResponse> getJobList() {
        MutableLiveData<JobResponse> jobResponseMutableLiveData = new MutableLiveData<>();

        apiInterface.getJobList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<JobResponse>() {

                    @Override
                    protected void onStart() {
                        super.onStart();

                    }

                    @Override
                    public void onSuccess(JobResponse response) {
                        jobResponseMutableLiveData.setValue(response);
                    }

                    @Override
                    public void onError(Throwable e) {
                        jobResponseMutableLiveData.setValue(null);
                    }
                });

        return jobResponseMutableLiveData;
    }
}
