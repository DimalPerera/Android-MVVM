package com.temper.assessment.model.job;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class JobCategory implements Serializable {

	@SerializedName("description")
	private String description;

	@SerializedName("icon_path")
	private String iconPath;

	@SerializedName("slug")
	private String slug;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setIconPath(String iconPath){
		this.iconPath = iconPath;
	}

	public String getIconPath(){
		return iconPath;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	@Override
 	public String toString(){
		return 
			"JobCategory{" + 
			"description = '" + description + '\'' + 
			",icon_path = '" + iconPath + '\'' + 
			",slug = '" + slug + '\'' + 
			"}";
		}
}