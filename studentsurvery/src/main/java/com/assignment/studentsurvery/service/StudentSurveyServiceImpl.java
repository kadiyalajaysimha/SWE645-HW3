package com.assignment.studentsurvery.service;

import com.assignment.studentsurvery.Entity.Survey;
import com.assignment.studentsurvery.dao.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentSurveyServiceImpl implements StudentSurveyService{

    private SurveyRepository surveyRepository;

    @Autowired
    StudentSurveyServiceImpl(SurveyRepository surveyRepository){
        this.surveyRepository = surveyRepository;
    }


    @Override
    public List<Survey> getSurveys() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey getSurveyById(int surveyId) {
        Optional<Survey> result = surveyRepository.findById(surveyId);
        Survey survey = null;
        if (result.isPresent()){
            System.out.println(result.get());
            survey = result.get();
        }else {
            throw new RuntimeException("Couldn't fetch the survey");
        }
        return survey;
    }

    @Override
    public String createSurvey(Survey survey) {
        String errorMessage = validateSurvey(survey);
        if (!errorMessage.equals("Fields - ")){
            errorMessage = errorMessage.substring(0, errorMessage.length()-2);
            errorMessage += " cannot be null";
            return errorMessage;
        }
        Survey createdSurvey = surveyRepository.save(survey);
        if (createdSurvey == null) {
            throw new RuntimeException("Error saving the new survey");
        }

        return "Success";
    }

    @Override
    public String updateSurvey(Survey survey) {
        String errorMessage = validateSurvey(survey);
        if (!errorMessage.equals("Fields - ")){
            errorMessage = errorMessage.substring(0, errorMessage.length()-2);
            errorMessage += " cannot be null";
            return errorMessage;
        }
        Survey updatedSurvey = surveyRepository.save(survey);
        if (updatedSurvey == null) {
            throw new RuntimeException("Error saving the changes of survey");
        }

        return "Success";
    }

    @Override
    public void deleteSurveyById(int id) {
        surveyRepository.deleteById(id);
    }

    public String validateSurvey(Survey survey){
        String errorMessage = "Fields - ";
        if (survey.getFirstName() == null || survey.getFirstName() == ""){
            errorMessage += "FirstName, ";
        }
        if (survey.getLastName() == null || survey.getLastName() == ""){
            errorMessage += "LastName, ";
        }
        if (survey.getStreetAddress() == null || survey.getStreetAddress() == ""){
            errorMessage += "StreetAddress, ";
        }
        if (survey.getCity() == null || survey.getCity() == ""){
            errorMessage += "City, ";
        }
        if (survey.getState() == null || survey.getState() == ""){
            errorMessage += "State, ";
        }
        if (survey.getZip() == null || survey.getZip() == ""){
            errorMessage += "Zip, ";
        }
        if (survey.getEmail() == null || survey.getEmail() == ""){
            errorMessage += "Email, ";
        }
        if (survey.getTelephone() == null || survey.getTelephone() == ""){
            errorMessage += "Telephone, ";
        }
        if (survey.getSurveyDate() == null || survey.getSurveyDate().equals("")){
            errorMessage += "SurveyDate, ";
        }

       return errorMessage;

    }
}
