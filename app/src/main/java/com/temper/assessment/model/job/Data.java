package com.temper.assessment.model.job;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Data implements Serializable {


	@SerializedName("2019-10-10")
	private List<JobItem> jsonMember20191010;


	public void setJsonMember20191010(List<JobItem> jsonMember20191010){
		this.jsonMember20191010 = jsonMember20191010;
	}

	public List<JobItem> getJsonMember20191010(){
		return jsonMember20191010;
	}


	@Override
 	public String toString(){
		return 
			"Data{" + 
			"2019-10-10 = '" + jsonMember20191010 + '\'' +
			"}";
		}
}