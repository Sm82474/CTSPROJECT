package com.cts.junitlearn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.Exception;

class CarTest {

	/*Car car;
	
	@BeforeEach
	void setUp() throws Exception {
		car=Mockito.mock(Car.class);
	}*/
	@Mock
	Car car;
	@BeforeEach
	void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@AfterEach
	void tearDone() throws Exception {
		
	}
	@Test
	void test() {
		assertEquals(false,car.needFuel());
		assertEquals(0.0,car.getEngineTemperature());
		car.driveTo("delhi");
		Mockito.verify(car).driveTo("delhi");
		
	}
	

}
