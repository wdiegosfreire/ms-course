package com.dfdevforge.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfdevforge.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}