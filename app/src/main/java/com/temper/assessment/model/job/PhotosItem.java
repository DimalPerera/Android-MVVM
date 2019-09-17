package com.temper.assessment.model.job;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class PhotosItem implements Serializable {

	@SerializedName("formats")
	private List<FormatsItem> formats;

	public void setFormats(List<FormatsItem> formats){
		this.formats = formats;
	}

	public List<FormatsItem> getFormats(){
		return formats;
	}

	@Override
 	public String toString(){
		return 
			"PhotosItem{" + 
			"formats = '" + formats + '\'' + 
			"}";
		}
}