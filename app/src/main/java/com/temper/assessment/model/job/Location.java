package com.temper.assessment.model.job;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Location implements Serializable {

	@SerializedName("lat")
	private String lat;

	@SerializedName("lng")
	private String lng;

	public void setLat(String lat){
		this.lat = lat;
	}

	public String getLat(){
		return lat;
	}

	public void setLng(String lng){
		this.lng = lng;
	}

	public String getLng(){
		return lng;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"lat = '" + lat + '\'' + 
			",lng = '" + lng + '\'' + 
			"}";
		}
}