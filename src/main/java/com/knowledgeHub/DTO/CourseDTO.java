package com.knowledgeHub.DTO;


public class CourseDTO {

    private String title;
    private String description;
    private String link;
    private String techStack; // name
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTechStack() {
		return techStack;
	}
	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}
}