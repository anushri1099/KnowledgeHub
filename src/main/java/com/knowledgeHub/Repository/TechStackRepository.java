package com.knowledgeHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knowledgeHub.Entity.TechStack;

@Repository
public interface TechStackRepository extends JpaRepository<TechStack, Long> {
	TechStack findByTechstackName(String techstackName);
	

}
