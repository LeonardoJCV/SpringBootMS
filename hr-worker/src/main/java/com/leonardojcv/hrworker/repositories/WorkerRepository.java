package com.leonardojcv.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardojcv.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
