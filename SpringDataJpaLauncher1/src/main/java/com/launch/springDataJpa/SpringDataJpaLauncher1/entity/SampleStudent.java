package com.launch.springDataJpa.SpringDataJpaLauncher1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SampleStudent {
	@Id
	private Integer sid;
	@Column(name="sName")
	private String sname;
	
	public SampleStudent(){
		System.out.println("Object of entity class got created");
	}
	
	public SampleStudent(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "SampleStudent [sid=" + sid + ", sname=" + sname + "]";
	}

	
	
}
