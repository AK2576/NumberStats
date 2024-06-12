package com.amena;

import java.util.Scanner;

/**
 * @author AmenaKassim
 * @date 04/25/2024
 * Unit 1.2a Lab - Checking if the value is Odd, Even and Prime
 */
public class NumberStats {
	
	/**
	 * Main method.
	 * @param args Command Line arguments.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// To ask the user for a number, use `input.nextInt()`
		System.out.println("Please enter a number");
//		System.out.println(input.nextInt());
		
		// Users input.
		int userNum = input.nextInt();
		System.out.println(userNum);
		MyNumber user = new MyNumber(userNum);
		
		System.out.println(user.isEven());
		System.out.println(user.isOdd());
		System.out.println(user.isPrime());

	}
}

/**
 * A my number class that checks if the value is even, odd, and prime.
 */
class MyNumber {
	/**
	 * Instance variable for val.
	 */
	private int val;

	/**
	 * Overloaded constructor.
	 * @param val Takes in the interger value.
	 */
	public MyNumber(int val) {
		this.val = val;
	}

	/**
	 * Default constructor that give an input for val.
	 */
	public MyNumber() {
		this.val = 0;
	}

	/**
	 * Getter method for val.
	 * @return Interger value of val.
	 */
	public int getVal() {
		return this.val;
	}

	/**
	 * Checks if the number is even.
	 * @return Whether or not the number is even.
	 */
	// A method called isEven() that returns true if val is even, otherwise it returns false.
		public boolean isEven() {
			if (val % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
	
		/**
		 * Checks if the number is odd.
		 * @return Whether or not the number is odd.
		 */
	// A method called isOdd() that returns true if val is odd, otherwise it returns false.
	public boolean isOdd() {
		if (val % 2 != 0) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * Checks if the number is prime.
	 * @return Whether or not the number is prime.
	 */
	// A method called isPrime() that returns true if val is a prime number, otherwise it returns false.
	public boolean isPrime() {
		if (val == 1) {
			return false;
		}
		
		for (int i = 2; i < val; i++) {
			if (val % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}