package com.quiz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.app.dao.QuestionDAO;
import com.quiz.app.entities.Questions;

@Service
public class QuestionService {

	@Autowired
	QuestionDAO questionDao;
//Fetch Api	
	public List<Questions> getAllQuestions() {
		
		return questionDao.findAll();
	}

	//Fetch Api
	public List<Questions> getQuestionsByCategory(String category) {
		
		return questionDao.findByCategory(category);
	}
	
	public String addQuestion(Questions questions) {
		 
		 questionDao.save(questions);
		 
		 return "Success";
	}

	public String updateQuestion(Questions questions) {
		
		questionDao.save(questions);
		
		return "update Done";
	}
	public String delete(Questions questions) {
		
		questionDao.delete(questions);
		
		return "Deleted Successfully";
	}
}
