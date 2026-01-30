package com.knowledgeHub.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgeHub.Entity.QnAItems;
import com.knowledgeHub.Repository.QnARepository;

@RestController
@RequestMapping("/api/QnA")
public class QnAController {
	
	private final QnARepository repo;
	
	public QnAController(QnARepository repo) {
		this.repo = repo;
	}
	@PostMapping
	public ResponseEntity<?> postQuestion(@RequestBody QnAItems question){
		
		repo.save(question);
		return ResponseEntity.status(HttpStatus.CREATED).body(question);
	}
	
	@GetMapping
	public ResponseEntity<?> getQuestions(){
		List<QnAItems> questionList = repo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(questionList);
	}
	
	@PutMapping("/{id}/answer")
	public ResponseEntity<QnAItems> updateAnswer(
	        @PathVariable Long id,
	        @RequestBody String answer) {
	    QnAItems item = repo.findById(id)
	                           .orElseThrow(() -> new RuntimeException("Question not found"));
	    item.setAnswer(answer);
	    return ResponseEntity.ok(repo.save(item));
	}


}
