package com.codeWithNagas.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_data")
public class Test // plan old java object --POJO
{
	@Id
	private int  sid;
	private StudentName sname;
	//@Column(name="Student_name")
	
	public StudentName getSname() {
		return sname;
	}
	public void setSname(StudentName sname) {
		this.sname = sname;
	}
	private String color;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Test [sid=" + sid + ", sname=" + sname + ", color=" + color + "]";
	}


}
