package com.example.demo;

public class Person {
	
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}