package org.java.knowledge.smallProblem;

import java.util.Scanner;

/**
 * @author Sagar Naik :  15_07_2021 _  To check prime number
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number to check prime number :-");
		int no = scan.nextInt();
		boolean value = checkPrime(no);
		if(value)
			System.out.println("Enter number is prime");
		else
			System.out.println("Entered number is not prime");
	}
	
	private static boolean checkPrime(int number) {
		int i=2;
		while(number-1 >= i) {
			if(number % i == 0){
				return false;
			}
			i++;				
		}
		if(number == i)
			return true;
		else
			return false;
	}
}
