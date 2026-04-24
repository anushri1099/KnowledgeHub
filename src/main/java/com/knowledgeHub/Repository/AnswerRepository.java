package com.knowledgeHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowledgeHub.Entity.Answers;

public interface AnswerRepository extends JpaRepository<Answers, Long> {}