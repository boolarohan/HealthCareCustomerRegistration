package com.capgemini.healthcare.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.healthcare.service.ServiceLayer;
import com.capgemini.healthcare.service.ServiceLayerImpl;

public class HealthCareTest {
	
static ServiceLayer serviceObject;
@BeforeClass
public static void setUp() {
	serviceObject = new ServiceLayerImpl();
}
	@Test
	public void testValidateName() {
		
	}
 
	@Test
	public void testValidatePassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateNum() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateemail() {
		fail("Not yet implemented");
	}

}
