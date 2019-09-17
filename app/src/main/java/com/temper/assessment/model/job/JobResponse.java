package com.temper.assessment.model.job;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class JobResponse implements Serializable {

	/*@SerializedName("data")
	private Data data;*/

	@SerializedName("meta")
	private Meta meta;

	/*@SerializedName("data")
	private Map<String, ArrayList<JobItem>> result;*/
	@SerializedName("data")
	private ArrayList<JobItem> modifiedJobPost;

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	/*public Map<String, ArrayList<JobItem>> getResult() {
		return result;
	}

	public void setResult(Map<String, ArrayList<JobItem>> result) {
		this.result = result;
	}*/

	public ArrayList<JobItem> getModifiedJobPost() {
		return modifiedJobPost;
	}

	public void setModifiedJobPost(ArrayList<JobItem> modifiedJobPost) {
		this.modifiedJobPost = modifiedJobPost;
	}
}