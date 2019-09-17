package com.temper.assessment.model.deserializer;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.temper.assessment.model.job.JobItem;
import com.temper.assessment.util.Constants;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class ModifiedJobPostDeserializer implements JsonDeserializer<ArrayList<JobItem>> {

    private Date newDate;
    private SimpleDateFormat format;
    private String formattedDate;

    @Override
    public ArrayList<JobItem> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        ArrayList<JobItem> modifiedJobPostArrayList = new ArrayList<>();

        JsonObject questionMark = json.getAsJsonObject();

        Set<String> keys = questionMark.keySet();

        for (String entry : keys) {

            JobItem jobItem = new JobItem();
            jobItem.setViewType(Constants.HEADER_VIEW);

            try {

                format = new SimpleDateFormat("yyyy-MM-dd");
                newDate = format.parse(entry);
                format = new SimpleDateFormat("EEEE, MMMM dd");
                formattedDate = format.format(newDate);
                jobItem.setHeaderDate(formattedDate);

            } catch (ParseException e) {
                e.printStackTrace();
                jobItem.setHeaderDate(entry);
            }

            modifiedJobPostArrayList.add(jobItem);

            JsonArray jarray = questionMark.getAsJsonArray(entry);


            if (jarray.size() > 0) {

                Type type = new TypeToken<ArrayList<JobItem>>() {
                }.getType();
                ArrayList<JobItem> targetArray = new Gson().fromJson(jarray.toString(), type);

                for (JobItem job : targetArray) {

                    job.setViewType(Constants.DETAIL_VIEW);
                    modifiedJobPostArrayList.add(job);

                }

            }

        }

        /*String jsons = new Gson().toJson(modifiedJobPostArrayList);
        Log.e("TAG", "deserialize: jsons " + jsons);*/

        return modifiedJobPostArrayList;
    }
}
