package com.qa.screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TakeScreenShot extends BaseTestScreenShot {
	
	@BeforeMethod
	public void setUp() {
		Initialize();
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
		
	@Test
	public void TakeScreeshest() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void TakeSceshotTest() {
		Assert.assertEquals(true, true);
	}
	@Test
	public void TakotTest() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void TakeScreeshotTest() {
		Assert.assertEquals(true, true);
	}}

