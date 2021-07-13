package com.training.airproject.bean;

import java.util.Arrays;


public class Airline {
	private String destination; 
	private int flightNum;
	private String airplaneType;
	private int depTime;
	private String[] depDays = new String[7]; 

	
	  public Airline(String destination, int flightNum, String airplaneType, int
	  depTime, String[] depDays) {
		  super(); 
		  this.destination = destination; 
		  this.flightNum = flightNum; 
		  this.airplaneType = airplaneType; 
		  this.depTime = depTime;
		  this.depDays = depDays; 
	  }


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getFlightNum() {
		return flightNum;
	}


	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}


	public String getAirplaneType() {
		return airplaneType;
	}


	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}


	public int getDepTime() {
		return depTime;
	}


	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}


	public String[] getDepDays() {
		return depDays;
	}


	public void setDepDays(String[] depDays) {
		this.depDays = depDays;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + Arrays.hashCode(depDays);
		result = prime * result + depTime;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNum;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (!Arrays.equals(depDays, other.depDays))
			return false;
		if (depTime != other.depTime)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNum != other.flightNum)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return " Рейс: Minsk - " + destination + " | № Рейса: " + flightNum + " | Тип самолёта: " + airplaneType
				+ " | Время отправления: " + depTime + " p.m." + " | Дни отправления: " + Arrays.toString(depDays) + " " ;
	}
	  
	  
	  
}