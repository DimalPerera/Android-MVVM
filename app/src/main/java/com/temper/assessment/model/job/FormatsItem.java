package com.temper.assessment.model.job;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class FormatsItem implements Serializable {

	@SerializedName("cdn_url")
	private String cdnUrl;

	public void setCdnUrl(String cdnUrl){
		this.cdnUrl = cdnUrl;
	}

	public String getCdnUrl(){
		return cdnUrl;
	}

	@Override
 	public String toString(){
		return 
			"FormatsItem{" + 
			"cdn_url = '" + cdnUrl + '\'' + 
			"}";
		}
}