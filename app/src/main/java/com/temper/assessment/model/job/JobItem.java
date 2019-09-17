package com.temper.assessment.model.job;

import java.util.ArrayList;

import com.temper.assessment.model.deserializer.ModifiedJobPost;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class JobItem extends ModifiedJobPost implements Serializable {

	@SerializedName("title")
	private String title;

	@SerializedName("id")
	private int id;

	@SerializedName("key")
	private String key;

	@SerializedName("date")
	private Date date;

	@SerializedName("allows_factoring")
	private boolean allowsFactoring;

	@SerializedName("location")
	private Location location;

	@SerializedName("distance")
	private Object distance;

	@SerializedName("url")
	private String url;

	@SerializedName("max_possible_earnings_hour")
	private String maxPossibleEarningsHour;

	@SerializedName("max_possible_earnings_total")
	private String maxPossibleEarningsTotal;

	@SerializedName("client")
	private Client client;

	@SerializedName("job_category")
	private JobCategory jobCategory;

	@SerializedName("open_positions")
	private int openPositions;

	@SerializedName("new_matches_count")
	private int newMatchesCount;

	@SerializedName("photo")
	private String photo;

	@SerializedName("shifts")
	private ArrayList<ShiftsItem> shifts;

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setDate(Date date){
		this.date = date;
	}

	public Date getDate(){
		return date;
	}

	public void setAllowsFactoring(boolean allowsFactoring){
		this.allowsFactoring = allowsFactoring;
	}

	public boolean isAllowsFactoring(){
		return allowsFactoring;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setDistance(Object distance){
		this.distance = distance;
	}

	public Object getDistance(){
		return distance;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setMaxPossibleEarningsHour(String maxPossibleEarningsHour){
		this.maxPossibleEarningsHour = maxPossibleEarningsHour;
	}

	public String getMaxPossibleEarningsHour(){
		return maxPossibleEarningsHour;
	}

	public void setMaxPossibleEarningsTotal(String maxPossibleEarningsTotal){
		this.maxPossibleEarningsTotal = maxPossibleEarningsTotal;
	}

	public String getMaxPossibleEarningsTotal(){
		return maxPossibleEarningsTotal;
	}

	public void setClient(Client client){
		this.client = client;
	}

	public Client getClient(){
		return client;
	}

	public void setJobCategory(JobCategory jobCategory){
		this.jobCategory = jobCategory;
	}

	public JobCategory getJobCategory(){
		return jobCategory;
	}

	public void setOpenPositions(int openPositions){
		this.openPositions = openPositions;
	}

	public int getOpenPositions(){
		return openPositions;
	}

	public void setNewMatchesCount(int newMatchesCount){
		this.newMatchesCount = newMatchesCount;
	}

	public int getNewMatchesCount(){
		return newMatchesCount;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setShifts(ArrayList<ShiftsItem> shifts){
		this.shifts = shifts;
	}

	public ArrayList<ShiftsItem> getShifts(){
		return shifts;
	}

	@Override
 	public String toString(){
		return 
			"JobItem{" +
			"title = '" + title + '\'' + 
			",id = '" + id + '\'' + 
			",key = '" + key + '\'' + 
			",date = '" + date + '\'' + 
			",allows_factoring = '" + allowsFactoring + '\'' + 
			",location = '" + location + '\'' + 
			",distance = '" + distance + '\'' + 
			",url = '" + url + '\'' + 
			",max_possible_earnings_hour = '" + maxPossibleEarningsHour + '\'' + 
			",max_possible_earnings_total = '" + maxPossibleEarningsTotal + '\'' + 
			",client = '" + client + '\'' + 
			",job_category = '" + jobCategory + '\'' + 
			",open_positions = '" + openPositions + '\'' + 
			",new_matches_count = '" + newMatchesCount + '\'' + 
			",photo = '" + photo + '\'' + 
			",shifts = '" + shifts + '\'' + 
			"}";
		}
}