package com.temper.assessment.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.temper.assessment.model.job.JobResponse;
import com.temper.assessment.repository.NetworkRepository;


public class JobViewModel extends ViewModel {

    private NetworkRepository networkRepository;

    private MutableLiveData<JobResponse> jobListLiveData;

    public void init(){

        if (jobListLiveData != null){
            return;
        }

        networkRepository = NetworkRepository.getInstance();

        jobListLiveData = networkRepository.getJobList();
    }

    public LiveData<JobResponse> getJobRepository() {
        return jobListLiveData;
    }

}
