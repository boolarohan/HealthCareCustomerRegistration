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
		boolean flag=serviceObject.validateName("ROHAN");
		assertEquals(true,flag);
				
		
	}
 
	@Test
	public void testValidatePassword() {

			boolean flag=serviceObject.validatePassword("123$123");
			assertEquals(true,flag);
	}

	@Test
	public void testValidateNum() {
		
			boolean flag=serviceObject.validateNum("7893732190");
			assertEquals(true,flag);
	}

	@Test
	public void testValidateemail() {
			boolean flag=serviceObject.validateemail("rohan@gmail.com");
			assertEquals(true,flag);
	}

}
