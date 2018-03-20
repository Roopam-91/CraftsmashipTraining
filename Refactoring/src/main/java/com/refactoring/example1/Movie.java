package com.refactoring.example1;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private int _priceCode;
	
	public Movie (String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}
	
	public int getPriceCode () {
		return _priceCode;
	}
	
	public void setPriceCode (int arg) {
		_priceCode = arg;
	}
	
	public String getTitle () {
		return _title;
	}

	double getRentalAmount(int _daysRented) {
		double thisAmount=0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (_daysRented > 2)
					thisAmount += (_daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += _daysRented * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (_daysRented > 3)
					thisAmount += (_daysRented - 3) * 1.5;
				break;
			
		}
		return thisAmount;
	}
}
