package com.example.quizSystem.controller;

import com.example.quizSystem.Model.Question;
import com.example.quizSystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired(required = false)
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<Question> getData(){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question>getQuestionByCategory(String category){
        return questionService.getQuestionByCategory(category);
    }
}
