package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Bug implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
private int id;
@NotNull
@NotBlank(message="Email cannot be null")
	private String email;
	private String owner;
	@NotNull
	private int priority;
	private STATUS status;
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date createdDate=new Date();
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date completeDate;
	private String description;
	private boolean attachedfiles;
	
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	 
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCompleteDate() {
		return completeDate;
	}
	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getAttachedfiles() {
		return attachedfiles;
	}
	public void setAttachedfiles(boolean attachedfiles) {
		this.attachedfiles = attachedfiles;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	

}
