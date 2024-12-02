package com.assignment.studentsurvery.service;

import com.assignment.studentsurvery.Entity.Survey;

import java.util.List;

public interface StudentSurveyService {
    List<Survey> getSurveys();

    Survey getSurveyById(int id);

    String createSurvey(Survey survey);
    String updateSurvey(Survey survey);


    void deleteSurveyById(int id);

    String validateSurvey(Survey survey);
}
