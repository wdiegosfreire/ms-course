package com.dfdevforge.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	private Double dailyIncome;
	public Double getDailyIncome() {return dailyIncome;}
	public void setDailyIncome(Double dailyIncome) {this.dailyIncome = dailyIncome;}

	private Integer days;
	public Integer getDays() {return days;}
	public void setDays(Integer days) {this.days = days;}

	public Payment() {
	}

	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public double getTotal() {
		return days * dailyIncome;
	}
}