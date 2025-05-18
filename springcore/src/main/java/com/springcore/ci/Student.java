package com.springcore.ci;

public class Student {
	private int id;
	private String name;
	private Certificate certificate;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", certificate=" + certificate + "]";
	}
	

}
