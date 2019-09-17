package com.temper.assessment.model.job;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Meta implements Serializable {

	@SerializedName("api_version")
	@Expose
	private ApiVersion apiVersion;

	public void setApiVersion(ApiVersion apiVersion){
		this.apiVersion = apiVersion;
	}

	public ApiVersion getApiVersion(){
		return apiVersion;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"api_version = '" + apiVersion + '\'' + 
			"}";
		}
}