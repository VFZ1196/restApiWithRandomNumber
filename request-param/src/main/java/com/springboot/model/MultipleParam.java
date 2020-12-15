package com.springboot.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MultipleParam {
	
	Random random = new Random();
	

	public static double getRandomNumber(double min, double max) {
		double r = (int)(Math.random()*(max-min+1)+min);
		return r;
	}
	
	@Id
	@Column
    @GeneratedValue
	private long id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private Long randomNumber = (long) getRandomNumber(200,400);
	//random.nextInt(50);
	
	public MultipleParam() {
		
	}

	public MultipleParam(String firstname, String lastname, String email, Long randomNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.randomNumber = randomNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(Long randomNumber) {
		this.randomNumber = randomNumber;
	}

	@Override
	public String toString() {
		return "MultipleParam [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", randomNumber=" + randomNumber + "]";
	}
	

	
}
