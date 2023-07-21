package com.Byla.model;

public class Flight
{
	private String id;
	private String source;
	private String destination;
	private double fare;
	private int totalSeats;
	private String arrivalTime;
	private String departureTime;
	private String companyName;
	private double availableSeats;
	public Flight()
	{
		
	}
	public Flight(String id, String source, String destination, double fare, int totalSeats, String arrivalTime,
			String departureTime, String companyName, double availableSeats) {
		
		this.id = id;       this.source = source;
		this.destination = destination;     this.fare = fare;
		this.totalSeats = totalSeats;      this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;   this.companyName = companyName;
		this.availableSeats = availableSeats;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(double availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	

}
