package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="College")
public class College {

	
	@Id
	private Integer id;
	private String collegeadmin;
	private String collegename;
	private String location;
	public College() {
		super();
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollegeadmin() {
		return collegeadmin;
	}
	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeadmin=" + collegeadmin + ", collegename=" + collegename + ", location="
				+ location + "]";
	}
	public College(Integer id, String collegeadmin, String collegename, String location) {
		super();
		this.id = id;
		this.collegeadmin = collegeadmin;
		this.collegename = collegename;
		this.location = location;
	}
	
}
