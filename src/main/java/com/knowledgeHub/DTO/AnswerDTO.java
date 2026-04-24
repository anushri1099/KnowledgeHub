package com.knowledgeHub.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDTO {
    public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	private String answerText;
}