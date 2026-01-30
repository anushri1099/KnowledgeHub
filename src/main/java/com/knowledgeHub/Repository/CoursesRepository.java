package com.knowledgeHub.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowledgeHub.Entity.CoursesItem;

public interface CoursesRepository extends JpaRepository<CoursesItem, Long> {
    List<CoursesItem> findByTechStack_TechstackName(String techstackName);
    // or
    List<CoursesItem> findByTechStack_TechStackId(Long techStackId);
}

