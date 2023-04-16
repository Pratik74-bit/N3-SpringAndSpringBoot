package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	private Integer id;
	private String name;
	private Integer type;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, Integer type, String password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
