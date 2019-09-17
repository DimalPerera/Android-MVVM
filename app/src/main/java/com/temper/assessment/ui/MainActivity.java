package com.temper.assessment.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.temper.assessment.R;
import com.temper.assessment.adapters.JobListAdapter;
import com.temper.assessment.databinding.ActivityMainBinding;
import com.temper.assessment.model.job.JobItem;
import com.temper.assessment.model.job.JobResponse;
import com.temper.assessment.util.HeaderItemDecoration;
import com.temper.assessment.viewmodels.JobViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private JobViewModel jobViewModel;

    private ArrayList<JobItem> getJobPostData = new ArrayList<>();
    private JobListAdapter jobPostsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        jobViewModel = ViewModelProviders.of(this).get(JobViewModel.class);
        jobViewModel.init();

        jobViewModel.getJobRepository().observe(this, (JobResponse newsResponse) -> {

            //Meta meta = newsResponse.getMeta();
            //Log.e("TAG", "onCreate: " + meta.getApiVersion().getReleased() );

            getJobPostData.addAll(newsResponse.getModifiedJobPost());
            jobPostsAdapter.notifyDataSetChanged();

        });

        setupJobPostRecyclerView();
    }

    private void setupJobPostRecyclerView() {

        if (jobPostsAdapter == null) {
            jobPostsAdapter = new JobListAdapter(getJobPostData);

            binding.rvJobList.setAdapter(jobPostsAdapter);
            binding.rvJobList.setLayoutManager(new LinearLayoutManager(this));

            binding.rvJobList.addItemDecoration(new HeaderItemDecoration(binding.rvJobList, (HeaderItemDecoration.StickyHeaderInterface) jobPostsAdapter));
            binding.rvJobList.setItemAnimator(new DefaultItemAnimator());
            binding.rvJobList.setNestedScrollingEnabled(true);

        } else {
            jobPostsAdapter.notifyDataSetChanged();
        }
    }
}
