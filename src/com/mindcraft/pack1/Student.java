package com.mindcraft.pack1;

public class Student {

	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {

		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
	}
}