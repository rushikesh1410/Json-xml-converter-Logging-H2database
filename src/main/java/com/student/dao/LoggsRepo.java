package com.student.dao;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Loggs;

public interface LoggsRepo extends JpaRepository<Loggs, Integer> {
	
	void save(LocalDateTime date);

	void save(String operation);

}
