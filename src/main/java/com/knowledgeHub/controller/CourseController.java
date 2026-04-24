package com.knowledgeHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgeHub.DTO.CourseDTO;
import com.knowledgeHub.services.CourseService;



@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService service;

    //Create
    @PostMapping("/createCourse")
    public ResponseEntity<?> create(@RequestBody CourseDTO dto) {
        return service.saveCourse(dto);
    }

    //Delete by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return service.deleteCourse(id);
    }

    //Get by TechStack
    @GetMapping("/tech/{name}")
    public ResponseEntity<?> getByTech(@PathVariable String name) {
        return service.getCoursesByTechStack(name);
    }
}