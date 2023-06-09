package com.zohocrm.entities;

import javax.persistence.*;

@Entity
@Table(name = "leads")
public class Lead {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false, length = 45)
	private String firstname;
	
	@Column(name = "last_name", nullable = false, length = 45)
	private String lastname;
	
	@Column(name = "email", nullable = false, unique = true, length = 128)
	private String email;
	
	@Column(name = "mobile", nullable = false, unique = true, length = 10)
	private long mobile;
	
	
	private String source;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	

}
