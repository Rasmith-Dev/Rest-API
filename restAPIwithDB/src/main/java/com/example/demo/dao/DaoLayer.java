package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Courses;

public interface DaoLayer extends JpaRepository<Courses, Integer> {

}
