package com.quiz.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.app.entities.Questions;

@Repository
public interface QuestionDAO extends JpaRepository<Questions, Integer> {

	  List<Questions> findByCategory(String category);
	
}
	
	

