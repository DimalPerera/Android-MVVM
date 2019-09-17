package com.temper.assessment.model.job;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Client implements Serializable {

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("photos")
	private List<PhotosItem> photos;

	@SerializedName("description")
	private String description;

	@SerializedName("factoring_allowed")
	private boolean factoringAllowed;

	@SerializedName("factoring_payment_term_in_days")
	private int factoringPaymentTermInDays;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPhotos(List<PhotosItem> photos){
		this.photos = photos;
	}

	public List<PhotosItem> getPhotos(){
		return photos;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setFactoringAllowed(boolean factoringAllowed){
		this.factoringAllowed = factoringAllowed;
	}

	public boolean isFactoringAllowed(){
		return factoringAllowed;
	}

	public void setFactoringPaymentTermInDays(int factoringPaymentTermInDays){
		this.factoringPaymentTermInDays = factoringPaymentTermInDays;
	}

	public int getFactoringPaymentTermInDays(){
		return factoringPaymentTermInDays;
	}

	@Override
 	public String toString(){
		return 
			"Client{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",photos = '" + photos + '\'' + 
			",description = '" + description + '\'' + 
			",factoring_allowed = '" + factoringAllowed + '\'' + 
			",factoring_payment_term_in_days = '" + factoringPaymentTermInDays + '\'' + 
			"}";
		}
}