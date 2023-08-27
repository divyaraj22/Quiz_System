package com.example.quizSystem;

import com.example.quizSystem.Model.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication

public class QuizSystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(QuizSystemApplication.class, args);
	}
}
