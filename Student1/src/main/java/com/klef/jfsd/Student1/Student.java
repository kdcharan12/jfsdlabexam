package com.klef.jfsd.Student1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student11")
public class Student {
	
	@Id
	@Column(name = "s_id")
	private int s_id;
	
	 @Column(name="s_name")
	 private String s_name;
	  
	 @Column(name = "s_loc")
	 private String s_loc;
	 
	 @Column(name = "s_hod_name")
	 private String s_hod_name;
	
	 
	  public Student() {
		    super();
		  }
	  
	  public Student(int id, String sname, String loc,String hod_name) {
		    super();
		    this.s_id = id;
		    this.s_name = sname;
		    this.s_loc = loc;
		    this.s_hod_name =hod_name;
		  }

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_loc() {
		return s_loc;
	}

	public void setS_loc(String s_loc) {
		this.s_loc = s_loc;
	}

	public String getS_hod_name() {
		return s_hod_name;
	}

	public void setS_hod_name(String s_hod_name) {
		this.s_hod_name = s_hod_name;
	}
	
	
	
	
}
