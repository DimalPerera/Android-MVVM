package com.temper.assessment.model.job;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ShiftsItem implements Serializable {

	@SerializedName("tempers_needed")
	private int tempersNeeded;

	@SerializedName("earnings_per_hour")
	private Object earningsPerHour;

	@SerializedName("duration")
	private int duration;

	@SerializedName("currency")
	private String currency;

	@SerializedName("start_date")
	private String startDate;

	@SerializedName("start_time")
	private String startTime;

	@SerializedName("start_datetime")
	private String startDatetime;

	@SerializedName("end_time")
	private String endTime;

	@SerializedName("end_datetime")
	private String endDatetime;

	@SerializedName("is_auto_accepted_when_applied_for")
	private int isAutoAcceptedWhenAppliedFor;

	public void setTempersNeeded(int tempersNeeded){
		this.tempersNeeded = tempersNeeded;
	}

	public int getTempersNeeded(){
		return tempersNeeded;
	}

	public void setEarningsPerHour(Object earningsPerHour){
		this.earningsPerHour = earningsPerHour;
	}

	public Object getEarningsPerHour(){
		return earningsPerHour;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStartDatetime(String startDatetime){
		this.startDatetime = startDatetime;
	}

	public String getStartDatetime(){
		return startDatetime;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return endTime;
	}

	public void setEndDatetime(String endDatetime){
		this.endDatetime = endDatetime;
	}

	public String getEndDatetime(){
		return endDatetime;
	}

	public void setIsAutoAcceptedWhenAppliedFor(int isAutoAcceptedWhenAppliedFor){
		this.isAutoAcceptedWhenAppliedFor = isAutoAcceptedWhenAppliedFor;
	}

	public int getIsAutoAcceptedWhenAppliedFor(){
		return isAutoAcceptedWhenAppliedFor;
	}

	@Override
 	public String toString(){
		return 
			"ShiftsItem{" + 
			"tempers_needed = '" + tempersNeeded + '\'' + 
			",earnings_per_hour = '" + earningsPerHour + '\'' + 
			",duration = '" + duration + '\'' + 
			",currency = '" + currency + '\'' + 
			",start_date = '" + startDate + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",start_datetime = '" + startDatetime + '\'' + 
			",end_time = '" + endTime + '\'' + 
			",end_datetime = '" + endDatetime + '\'' + 
			",is_auto_accepted_when_applied_for = '" + isAutoAcceptedWhenAppliedFor + '\'' + 
			"}";
		}
}