package com.cts.junitlearn;

import static org.junit.Assert.assertSame;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;

 class EvenorOddTest {

	EvenorOdd evenOdd;
	@BeforeEach
	void setUp() throws Exception {
		evenOdd= new EvenorOdd();
	}
	@AfterEach
	void tearDown() throws Exception {
		
	}
	@Test
	@Timeout(value=5000)
	@Ignore(value="ignore this test")
	void testEvenCheck() {
		assertTrue(evenOdd.evenCheck(10),"11 is not even");
		assertTrue(evenOdd.evenCheck(123456));
		assertTrue(evenOdd.evenCheck(156));
		
	}
	@Test
	void testOddCheck() {
		assertTrue(evenOdd.oddCheck(123));
		assertTrue(evenOdd.oddCheck(12345));
		
	}
	@Test
	void testFactorial() {
		assertSame(1,evenOdd.factorial(1));
		assertSame(1,evenOdd.factorial(0));
		assertSame(120,evenOdd.factorial(5));
		
		
	}
	
	}