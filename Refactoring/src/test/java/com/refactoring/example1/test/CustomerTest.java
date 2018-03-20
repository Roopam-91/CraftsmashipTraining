package com.refactoring.example1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.refactoring.example1.Customer;
import com.refactoring.example1.Movie;
import com.refactoring.example1.Rental;

public class CustomerTest {

	@Test
	public void testCustomerWithoutSingleOrder() {
		Customer customer=new Customer("Random Guy1");
		customer.statement();
	}
	@Test
	public void testCustomerWithOneOrMoreOrders() {

		Movie movie1=new Movie("IronMan", Movie.REGULAR);
		Movie movie2=new Movie("Jumanji", Movie.CHILDRENS);
		Movie movie3=new Movie("Black Panther", Movie.NEW_RELEASE);

		Rental rental1 =new Rental(movie1, 1);
		Rental rental2 =new Rental(movie2, 2);
		Rental rental3 =new Rental(movie3, 3);


		Customer customer=new Customer("Random Guy1");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		System.out.println(customer.statement());
		assertEquals("Rental Record for Random Guy1\n" +
				"	IronMan	2.0\n"+
				"	Jumanji	1.5\n"+
				"	Black Panther	9.0\n"+
				"Amount owed is 12.5\n"+
				"You earned 4 frequent renter points",customer.statement() );
	}
}
