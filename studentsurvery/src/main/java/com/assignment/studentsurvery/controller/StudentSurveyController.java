package com.assignment.studentsurvery.controller;

import com.assignment.studentsurvery.Entity.Survey;
import com.assignment.studentsurvery.service.StudentSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://ec2-3-213-242-74.compute-1.amazonaws.com:32005","http://localhost:3000")
@RequestMapping("/api")
public class StudentSurveyController {

    private StudentSurveyService studentSurveyService;

    @Autowired
    public StudentSurveyController(StudentSurveyService studentSurveyService){
        this.studentSurveyService = studentSurveyService;
    }

    @GetMapping("/getAllSurveys")
    public List<Survey> getAllSurveys(){
        return studentSurveyService.getSurveys();
    }

    @GetMapping("/getSurveyById/{surveyId}")
    public Survey getSuveryById(@PathVariable int surveyId){
        return studentSurveyService.getSurveyById(surveyId);
    }

    @PostMapping("/createNewSuvery")
    public ResponseEntity<String> createNewSuvery(@RequestBody Survey survey){
        String state = studentSurveyService.createSurvey(survey);
        if (state.equals("Success") ){
            return new ResponseEntity<>("Successfully created a Survey", HttpStatus.OK);
        }

        return new ResponseEntity<>("Error: "+ state, HttpStatus.OK);
    }

    @PutMapping("/updateSuvery")
    public ResponseEntity<String> updateSuvery(@RequestBody Survey survey){
        String state = studentSurveyService.updateSurvey(survey);
        if (state.equals("Success") ){
            return new ResponseEntity<>("Successfully updated the Survey", HttpStatus.OK);
        }

        return new ResponseEntity<>("Error: "+ state, HttpStatus.OK);
    }

    @DeleteMapping("/deleteSuveryById/{surveyId}")
    public String deleteSuveryById(@PathVariable int surveyId){
        studentSurveyService.deleteSurveyById(surveyId);
        return "Deleted Survey";
    }
}
