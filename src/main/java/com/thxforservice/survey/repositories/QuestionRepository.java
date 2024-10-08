package com.thxforservice.survey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.thxforservice.survey.constants.SurveyType;
import com.thxforservice.survey.entities.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long>, QuerydslPredicateExecutor<Question> {

}