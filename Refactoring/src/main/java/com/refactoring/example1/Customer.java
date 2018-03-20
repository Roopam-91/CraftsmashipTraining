package com.refactoring.example1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String _name;
	private Vector _rentals = new Vector ();
	
	public Customer (String name) {
		_name = name;
	}
	
	public void addRental (Rental arg) {
		_rentals.addElement (arg);
	}
	
	public String getName () {
		return _name;
	}
	
	public String statement () {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements ();
		String result = "Rental Record for " + getName () + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental rantalObj = (Rental) rentals.nextElement();
			thisAmount = rantalObj.getRentalAmount();
			frequentRenterPoints += rantalObj.getRenterPoints();
			result += "\t" + rantalObj.getMovie().getTitle() + "\t" + 
					String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			
		}
		result = logRentalFindings(totalAmount, frequentRenterPoints, result);
		return result;
	}

	private String logRentalFindings(double totalAmount, int frequentRenterPoints, String result) {
		result += "Amount owed is " + String.valueOf (totalAmount) + "\n";
		result += "You earned " + String.valueOf (frequentRenterPoints) + " frequent renter points";
		return result;
	}
}
