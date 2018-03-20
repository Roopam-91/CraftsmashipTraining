package com.refactoring.example1;

public class Rental {

	private Movie _movie;
	private int _daysRented;
	
	public Rental (Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented () {
		return _daysRented;
	}
	
	public Movie getMovie () {
		return _movie;
	}

	double getRentalAmount() {
		return _movie.getRentalAmount(_daysRented);
	}

	int getRenterPoints() {
		int frequentRenterPoints = 0;
		frequentRenterPoints ++;
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
				getDaysRented() > 1)
			frequentRenterPoints ++;
		return frequentRenterPoints;
	}
}
