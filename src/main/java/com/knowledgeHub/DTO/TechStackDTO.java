package com.knowledgeHub.DTO;


import lombok.*;


@Getter
@Setter
public class TechStackDTO {
   
	private String techstackName;

	public String getTechstackName() {
		return techstackName;
	}

	public void setTechstackName(String techstackName) {
		this.techstackName = techstackName;
	}
}