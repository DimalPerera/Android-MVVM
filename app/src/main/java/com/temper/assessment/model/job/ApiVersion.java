package com.temper.assessment.model.job;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ApiVersion implements Serializable {

	@SerializedName("current")
	@Expose
	private int current;

	@SerializedName("latest")
	@Expose
	private int latest;

	@SerializedName("released")
	@Expose
	private String released;

	@SerializedName("deprecation_date")
	@Expose
	private Object deprecationDate;

	public void setCurrent(int current){
		this.current = current;
	}

	public int getCurrent(){
		return current;
	}

	public void setLatest(int latest){
		this.latest = latest;
	}

	public int getLatest(){
		return latest;
	}

	public void setReleased(String released){
		this.released = released;
	}

	public String getReleased(){
		return released;
	}

	public void setDeprecationDate(Object deprecationDate){
		this.deprecationDate = deprecationDate;
	}

	public Object getDeprecationDate(){
		return deprecationDate;
	}

	@Override
 	public String toString(){
		return 
			"ApiVersion{" + 
			"current = '" + current + '\'' + 
			",latest = '" + latest + '\'' + 
			",released = '" + released + '\'' + 
			",deprecation_date = '" + deprecationDate + '\'' + 
			"}";
		}
}