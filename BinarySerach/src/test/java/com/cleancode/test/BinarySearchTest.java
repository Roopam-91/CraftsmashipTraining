package com.cleancode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cleancode.BinarySearch;

public class BinarySearchTest {

	@Test (timeout =5000)
	public void testArrayWithOddNmberOfElements() throws EmptyArrayException {
		int[] collection=new int[]{
				11,22,33,44,55,66,77
		};
		assertEquals(0, BinarySearch.search(collection,11));
		assertEquals(1, BinarySearch.search(collection,22));
		assertEquals(3, BinarySearch.search(collection,44));
		assertEquals(6, BinarySearch.search(collection,77));
		assertEquals(-1, BinarySearch.search(collection,17));
		assertEquals(-1, BinarySearch.search(collection,110));
	}
	@Test (timeout =5000)
	public void testArrayWithEvenNmberOfElements() throws EmptyArrayException {
		int[] collection=new int[]{
				11,22,33,44,55,66,77,88
		};
		assertEquals(0, BinarySearch.search(collection,11));
		assertEquals(1, BinarySearch.search(collection,22));
		assertEquals(3, BinarySearch.search(collection,44));
		assertEquals(4, BinarySearch.search(collection,55));
		assertEquals(7, BinarySearch.search(collection,88));
		assertEquals(-1, BinarySearch.search(collection,17));
		assertEquals(-1, BinarySearch.search(collection,110));
	}
	@Test (timeout =5000)
	public void testArrayWithOneElements() throws EmptyArrayException {
		int[] collection=new int[]{
				11};
		assertEquals(0, BinarySearch.search(collection,11));
		assertEquals(-1, BinarySearch.search(collection,8));
		assertEquals(-1, BinarySearch.search(collection,18));
	}
	@Test (timeout =5000,expected =EmptyArrayException.class)
	public void testEmptyArray() throws EmptyArrayException {
		int[] collection=new int[]{};
		assertEquals(-1, BinarySearch.search(collection,8));
		assertEquals(-1, BinarySearch.search(collection,18));
	}
}
