package com.training.airproject.list;

import java.util.ArrayList;
import java.util.List;

import com.training.airproject.bean.Airline;

public class Board {
	private List<Airline> flights;
	
	public Board() {
		flights = new ArrayList<Airline>();
	}

	public List<Airline> getFlights() {
		return flights;
	}

	public void setFlights(List<Airline> flights) {
		this.flights = flights;
	}
	
	public void add(Airline a) {
		flights.add(a);
	}
		
	public List<Airline> findByDestination(String destination){
		List<Airline> result = new ArrayList<Airline>();
		
		for(Airline a : flights) {
			if(a.getDestination().equals(destination)) {
				result.add(a);
			}
		}
		
		return result;
	}

	public List<Airline> findByAfterXDepTime(int time, String inputDay){
		List<Airline> result = new ArrayList<Airline>();
		
		for (int i = 0; i < flights.size(); i++) {
			for(int j = 0; j < flights.get(i).getDepDays().length; j++ ) {
				if (flights.get(i).getDepDays()[j] == inputDay && flights.get(i).getDepTime() > time) {
					result.add(flights.get(i));
				}
			}
		}
		
		return result;
	}
	public List<Airline> findByDepDays(String inputDay){
		List<Airline> result = new ArrayList<Airline>();
		for (int i = 0; i < flights.size(); i++) {
			for(int j = 0; j < flights.get(i).getDepDays().length; j++ ) {
				if (flights.get(i).getDepDays()[j] == inputDay) {
					result.add(flights.get(i));
				}
					
			}
			
			
		}
		
			return result;
			
	}
	
}
