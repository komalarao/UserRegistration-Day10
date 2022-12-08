package com.bridgelabz.user;

	import java.util.Scanner;

	public class UserRegistration {
		public static void main(String[] args) {
			UserInputValidation userInputValidation = new UserInputValidation();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter first name: ");
	        String firstName = scanner.next();
	        System.out.println(UserInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
	        System.out.println("Enter last name: ");
	        String lastName = scanner.next();
	        System.out.println(UserInputValidation.isValidLastName(lastName) ? "Valid" : "In Valid");
	        System.out.println("Enter email: ");
	        String email = scanner.next();
	        System.out.println(UserInputValidation.isValidEmail(email) ? "Valid" : "In Valid");
	        System.out.println("Enter mobile number: ");
	        String mobileNumber = scanner.next();
	        System.out.println(UserInputValidation.isValidMobileNumber(mobileNumber) ? "Valid" : "In Valid");
	        System.out.println("Enetr password: ");
	        String password = scanner.next();
	        System.out.println(UserInputValidation.isValidPassword(password) ? "Valid" : "In Valid");
	        scanner.close();
		}
	}

