package com.Byla.model;

import java.time.LocalDate;

public class Traveller 
{
	private String Name;
	private long mobile;
	private String email;
	private String flightId;
	private LocalDate date;
	public Traveller()
	{
		
	}
	public Traveller(String name, long mobile, String email, String flightId, LocalDate date) {
		super();
		Name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightId = flightId;
		this.date = date;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
