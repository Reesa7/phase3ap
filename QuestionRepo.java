package com.example.SpringQuiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringQuiz.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
