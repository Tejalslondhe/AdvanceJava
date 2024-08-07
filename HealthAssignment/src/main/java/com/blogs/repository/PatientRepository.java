package com.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
