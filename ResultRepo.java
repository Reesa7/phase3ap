package com.example.SpringQuiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringQuiz.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}