package com.temper.assessment.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.temper.assessment.R;
import com.temper.assessment.databinding.RowPostBinding;
import com.temper.assessment.databinding.RowPostHeaderBinding;
import com.temper.assessment.model.job.JobItem;
import com.temper.assessment.util.HeaderItemDecoration;

import java.util.ArrayList;

public class JobListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements HeaderItemDecoration.StickyHeaderInterface {

    private ArrayList<JobItem> getJobPostData;
    private OnItemClickListener listener;

    public JobListAdapter(ArrayList<JobItem> getJobPostData) {
        this.getJobPostData = getJobPostData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                RowPostHeaderBinding rowJobpostHeaderBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_post_header, parent, false);
                return new HeaderViewHolder(rowJobpostHeaderBinding);

            default:
                RowPostBinding rowPostBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_post, parent, false);
                return new ViewHolder(rowPostBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final JobItem jobItem = getJobPostData.get(position);

        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).binding.setJob(jobItem);
        } else if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).binding.setJob(jobItem);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return getJobPostData.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return getJobPostData.size();
    }

    @Override
    public int getHeaderPositionForItem(int itemPosition) {
        int headerPosition = 0;
        do {
            if (this.isHeader(itemPosition)) {
                headerPosition = itemPosition;
                break;
            }
            itemPosition -= 1;
        } while (itemPosition >= 0);
        return headerPosition;
    }


    @Override
    public int getHeaderLayout(int headerPosition) {
        if (getJobPostData.get(headerPosition).getViewType() == 1)
            return R.layout.row_post_header;
        else {
            return R.layout.row_post;
        }
    }

    @Override
    public void bindHeaderData(View header, int headerPosition) {
        JobItem child = getJobPostData.get(headerPosition);
        TextView tvName = header.findViewById(R.id.tvHeader);
        tvName.setText(child.getHeaderDate());
    }

    @Override
    public boolean isHeader(int itemPosition) {
        if (getJobPostData.get(itemPosition).getViewType() == 1)
            return true;
        else
            return false;
    }

    //Header view holder
    class HeaderViewHolder extends RecyclerView.ViewHolder {

        private final RowPostHeaderBinding binding;

        HeaderViewHolder(RowPostHeaderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

    //Job view holder
    class ViewHolder extends RecyclerView.ViewHolder {

        private final RowPostBinding binding;

        public ViewHolder(RowPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

    public void setListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(JobItem jobItem);
    }
}
