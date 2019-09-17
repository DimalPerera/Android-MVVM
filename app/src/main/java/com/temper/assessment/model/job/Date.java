package com.temper.assessment.model.job;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class Date implements Serializable {

	@SerializedName("date")
	private String date;

	@SerializedName("timezone_type")
	private int timezoneType;

	@SerializedName("timezone")
	private String timezone;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setTimezoneType(int timezoneType){
		this.timezoneType = timezoneType;
	}

	public int getTimezoneType(){
		return timezoneType;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	@Override
 	public String toString(){
		return 
			"Date{" + 
			"date = '" + date + '\'' + 
			",timezone_type = '" + timezoneType + '\'' + 
			",timezone = '" + timezone + '\'' + 
			"}";
		}
}