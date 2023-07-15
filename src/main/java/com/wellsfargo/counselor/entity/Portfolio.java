package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio 
{
	
	@Id
	@GeneratedValue
	private Long portifolioId;
	
	@Column(nullable=false)
	private Long creationDate;
	
	@ManyToOne
	@JoinColumn(name="client_fk_id")
	private Client clientob;

}
