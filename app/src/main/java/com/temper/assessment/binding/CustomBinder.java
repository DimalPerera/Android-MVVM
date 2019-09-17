package com.temper.assessment.binding;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.temper.assessment.R;
import com.temper.assessment.model.job.ShiftsItem;
import com.temper.assessment.util.GlideApp;

import java.util.ArrayList;
import java.util.Currency;

public class CustomBinder {

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String imageUrl){

        GlideApp.with(imageView.getContext())
                .load(imageUrl)
                .placeholder(R.drawable.logo_purple)
                .error(R.drawable.img_not_found)
                .into(imageView);
    }


    @BindingAdapter({"hourlyRate"})
    public static void currencyFormatter(TextView textView, String hourlyRate){
        Currency currency = Currency.getInstance("EUR");
        textView.setText(currency.getSymbol().concat(" " + hourlyRate));
    }

    @BindingAdapter({"timePeriod"})
    public static void jobTimePeriod(TextView textView, ArrayList<ShiftsItem> shiftsItems){
        if(shiftsItems != null && shiftsItems.size() > 0){
            textView.setText(shiftsItems.get(0).getStartTime().concat(" - " + shiftsItems.get(0).getEndTime()));
        }
    }

}
