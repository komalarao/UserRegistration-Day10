package com.bridgelabz.user;

public class UserInputValidation {
 public static boolean isValidFirstName(String firstName) {

			        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  //Declaring regex pattern to check the firstName

			        Pattern pattern = Pattern.compile(firstNameRegex);
			        Matcher matcher = pattern.matcher(firstName);

			        return matcher.matches();
			    }
			    
			 // Creating isValidLastName method to validate the last name given by user using regex
			    public static boolean isValidLastName(String lastName) {
			        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

			        Pattern pattern = Pattern.compile(firstNameRegex);

			        Matcher matcher = pattern.matcher(lastName);

			        return matcher.matches();
			    }
			    
			 // Creating isValidEmail method  to validate the email given by user using regex

			    public static boolean isValidEmail(String email) {

			        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
			                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
			                "(?:(\\.([A-Za-z]{2})))?$";;

			        Pattern pattern = Pattern.compile(emailRegex);

			        Matcher matcher = pattern.matcher(email);

			        return matcher.matches();
			    }
}
