package com.leonardojcv.hrworker.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_worker")
public class Worker implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private double dailyIncome;
	
	public Worker() {
	}

	public Worker(Long id, String name, double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDailyIncome() {
		return dailyIncome;
	}
	public void setDailyIncome(double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}
	
}
