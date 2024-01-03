package com.quiz.app.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table(name="Questions")
@Entity
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@Column
	private String category;
	
	@Column
	private String difficulty_level;
	
	@Column
	private String question_title;
	
	@Column
	private String option1;
	
	@Column
	private String option2;
	
	@Column
	private String option3;
	
	@Column
	private String option4;
	
	@Column
	private String right_answer;

	public Questions() {
	}
	
	public Questions(String category, String difficulty_level, String question_title, String option1,
			String option2, String option3, String option4, String right_answer) {
		this.category = category;
		this.difficulty_level = difficulty_level;
		this.question_title = question_title;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.right_answer = right_answer;
	}
}




