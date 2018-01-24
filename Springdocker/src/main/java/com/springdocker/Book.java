package com.springdocker;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private Long id;

	private String name;
	
	private String author;
	
	private String description;
	

	
	public Book()
	{
		
	}
	
	public Book(Long id, String name, String author, String description
			) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
		
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	

}