package com.assignment.studentsurvery.dao;

import com.assignment.studentsurvery.Entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
}
