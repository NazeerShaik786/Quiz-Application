package com.quiz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.app.entities.Questions;
import com.quiz.app.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionsController {

	@Autowired
	QuestionService questionservice;
	
	//Fetch Api
	@GetMapping("allQuestions")
	public List<Questions> getAllQuestion() {
		
		return questionservice.getAllQuestions();
	}
	//Fetch Api
	@GetMapping("category/{category}")
	public List<Questions> getQuestionsByCategory(@PathVariable String category){
		
		return questionservice.getQuestionsByCategory(category);
		
	}
	
	//Save Api
	
	@PostMapping("/add")
	public String addQuestions(@RequestBody Questions questions ){
		
		return questionservice.addQuestion(questions);
	}
	
	//Update Api
	
	@PostMapping("/update")
	public String updateQuestions(@RequestBody Questions questions ){
		
		return questionservice.updateQuestion(questions);
	}
	
	//Delete API
	
	@PostMapping("delete")
	public String delete(@RequestBody Questions questions) {
		
	    return questionservice.delete(questions);
	}
}
	

