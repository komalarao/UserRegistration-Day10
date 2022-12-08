package com.bridgelabz.user;

public class UserInputValidationTest {
	
		@Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidFirstName("Dipk");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidFirstName("Prjl");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidLastName("bhuwan");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenLastName_WhenShort_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidLastName("bh");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail_WhenValid_ShouldReturnTrue() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = userInputValidation.isValidEmail("bhuwanarya730@gmail.com");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidEmail("bhuwan..675.gmail.com");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidMobileNumber("91 9087654321");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = UserInputValidation.isValidMobileNumber("908765-4321908");
	        Assert.assertEquals(false, result);
	    }

	}

