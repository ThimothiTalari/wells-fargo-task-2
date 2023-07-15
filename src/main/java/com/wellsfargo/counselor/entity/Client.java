package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client 
{
	@Id
	@GeneratedValue
	private Long clientId;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private String phone;
	
	@Column(nullable=false)
	private String email;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="advisor_fk_id")
	private Advisor advisor;

	
	
	public Client() {
		super();
	}



	public Client(Long clientId, String firstName, String lastName, String phone, String email, Advisor advisor) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.advisor = advisor;
	}


	

	public Long getClientId() {
		return clientId;
	}


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Advisor getAdvisor() {
		return advisor;
	}



	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	
	
	
	
	
	
	



}
