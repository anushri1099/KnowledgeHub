package com.knowledgeHub.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="tech_stacks")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TechStack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long techStackId;

    @Column(nullable = false, unique = true)
    private String techstackName;

    @OneToMany(mappedBy = "techStack", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CoursesItem> courses = new ArrayList<>();

    public Long getTechStackId() { return techStackId; }
    public void setTechStackId(Long techStackId) { this.techStackId = techStackId; }

    public String getTechstackName() { return techstackName; }
    public void setTechstackName(String techstackName) { this.techstackName = techstackName; }

    public List<CoursesItem> getCourses() { return courses; }
    public void setCourses(List<CoursesItem> courses) { this.courses = courses; }
}
