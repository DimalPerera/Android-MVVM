package com.temper.assessment.util;

import android.content.Context;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

@GlideModule
public class TemperGlideApp extends AppGlideModule {

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        builder.setLogLevel(Log.DEBUG);
        builder.setDefaultRequestOptions(new RequestOptions().format(DecodeFormat.PREFER_RGB_565));
    }

    @Override
    public void registerComponents(Context context, Glide glide, Registry registry) {

    }

}

