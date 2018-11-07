package com.lit.hibernate;

public class Student 
{
	private int roll;
	private String name;
	private double cgpa;
	private long fees;
	public Student(String name, double cgpa, long fees) {
		super();
		this.name = name;
		this.cgpa = cgpa;
		this.fees = fees;
	}
	public Student() {
		super();
	}
	public Student(int roll, String name, double cgpa, long fees) 
	{
		super();
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
		this.fees = fees;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	
}
