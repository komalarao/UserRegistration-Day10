package com.bridgelabz.user;


	import org.junit.Assert;
	import org.junit.Test;

	public class UserInputValidationTest {
		@Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserInputValidationTest userInputValidationTest = new UserInputValidationTest();
	        boolean result = userInputValidationTest.isValidFirstName("Dipali");
	        Assert.assertEquals(true, result);
	    }
	    private boolean isValidFirstName(String string) {
			// TODO Auto-generated method stub
			return false;
		}
		@Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse() {
	        UserInputValidationTest userInputValidationTest = new UserInputValidationTest();
	        boolean result = userInputValidationTest.isValidFirstName("Pr");
	        Assert.assertEquals(false, result);
	    }
	}

