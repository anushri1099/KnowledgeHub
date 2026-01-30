package com.knowledgeHub.Entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="QnAItems")
@JsonPropertyOrder({ "id", "titleOfQuestion", "question", "answer" })
public class QnAItems {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String titleOfQuestion;
	 private String question;
	 @Column(columnDefinition = "LONGTEXT")
	 private String answer;
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getTitleOfQuestion() {
		 return titleOfQuestion;
	 }
	 public void setTitleOfQuestion(String titleOfQuestion) {
		 this.titleOfQuestion = titleOfQuestion;
	 }
	 public String getQuestion() {
		 return question;
	 }
	 public void setQuestion(String question) {
		 this.question = question;
	 }
	 public String getAnswer() {
		 return answer;
	 }
	 public void setAnswer(String answer) {
		 this.answer = answer;
	 }
	 
	 
}
