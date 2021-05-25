package com.example.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
public class Project implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Long id;
	

	private String name;
	private String description;
	@OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Bug> bug;
	@Enumerated(EnumType.STRING)
	private STATUS status;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public void setStatus(STATUS status) {
		this.status = status;
	}
	
	String getStatus() {
		
		return status.toString();

}
	
}
