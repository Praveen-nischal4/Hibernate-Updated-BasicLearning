package com.hms.model;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class patient {

	@Id
	@Column(name="pid")
	int pid;
	@Column(name="pname")
	String pname;
	@Column(name="email")
	String email;
	@Column(name="address")
	String address;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
