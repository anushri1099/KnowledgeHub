package com.knowledgeHub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgeHub.Entity.CoursesItem;
import com.knowledgeHub.Entity.TechStack;
import com.knowledgeHub.Repository.CoursesRepository;
import com.knowledgeHub.Repository.TechStackRepository;



@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CoursesHubController {

	
	private final CoursesRepository coursesRepo;
	private final TechStackRepository techStackRepo;

    public CoursesHubController(CoursesRepository coursesRepo,TechStackRepository techStackRepo) {
        this.coursesRepo = coursesRepo;
        this.techStackRepo = techStackRepo;
        
    }

    // 🔹 POST: Save knowledge
    @PostMapping("/save")
    public CoursesItem saveKnowledge(@RequestBody CoursesItem item) {
        return coursesRepo.save(item);
    }

    // 🔹 GET: Fetch by course type
    @GetMapping("/{courseType}")
    public List<CoursesItem> getByCourseType(
            @PathVariable String courseType) {
        return coursesRepo.findByTechStack_TechstackName(courseType);
    }
    
    // 🔹 Save multiple knowledge items in ONE API
    @PostMapping("/saveAll")
    public List<CoursesItem> saveAll(
            @RequestBody List<CoursesItem> items) {
        return coursesRepo.saveAll(items);
    }	
    
    @PostMapping("/saveAllStacks")
    public List<TechStack> saveAllTechStacks(
            @RequestBody List<TechStack> items) {
        return techStackRepo.saveAll(items);
    }	
    
    @GetMapping("/getAllStacks")
    public List<TechStack> getAllStacks() {
        return techStackRepo.findAll();
    }
}
