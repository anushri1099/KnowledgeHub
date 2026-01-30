package com.knowledgeHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowledgeHub.Entity.QnAItems;

public interface QnARepository extends JpaRepository<QnAItems, Long>{
	
	

}
