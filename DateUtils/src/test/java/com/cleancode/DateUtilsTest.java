package com.cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testDurationLessThanOneMonth() {
		assertEquals(0, DateUtils.duration(new Date(19,3,2018), new Date(19,3,2018)));
		assertEquals(9, DateUtils.duration(new Date(19,3,2018), new Date(28,3,2018)));
	}
	
	@Test
	public void testDurationLessThanOneYear() {
		assertEquals(12, DateUtils.duration(new Date(19,3,2018), new Date(31,3,2018)));
		assertEquals(40, DateUtils.duration(new Date(19,3,2018), new Date(28,4,2018)));
		assertEquals(70, DateUtils.duration(new Date(19,3,2018), new Date(28,5,2018)));
		assertEquals(101, DateUtils.duration(new Date(19,3,2018), new Date(28,6,2018)));
		assertEquals(131, DateUtils.duration(new Date(19,3,2018), new Date(28,7,2018)));
		assertEquals(162, DateUtils.duration(new Date(19,3,2018), new Date(28,8,2018)));
		assertEquals(193, DateUtils.duration(new Date(19,3,2018), new Date(28,9,2018)));
		assertEquals(223, DateUtils.duration(new Date(19,3,2018), new Date(28,10,2018)));
		assertEquals(254, DateUtils.duration(new Date(19,3,2018), new Date(28,11,2018)));
		assertEquals(284, DateUtils.duration(new Date(19,3,2018), new Date(28,12,2018)));
	}
	
	@Test
	public void testDurationWithDatesInDifferentYear() {
		assertEquals(315, DateUtils.duration(new Date(19,3,2018), new Date(28,01,2019)));
		assertEquals(346, DateUtils.duration(new Date(19,3,2018), new Date(28,02,2019)));
		assertEquals(374, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2019)));
		assertEquals(740, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2020)));
		assertEquals(1105, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2021)));
		assertEquals(2566, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2025)));
		assertEquals(39090, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2125)));
		assertEquals(75614, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2225)));
		assertEquals(148663, DateUtils.duration(new Date(19,3,2018), new Date(28,03,2425)));
		}

}

