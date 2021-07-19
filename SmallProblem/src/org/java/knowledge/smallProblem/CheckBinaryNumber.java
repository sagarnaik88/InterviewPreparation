package org.java.knowledge.smallProblem;

import java.util.Scanner;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter number to check primary number :- ");
		int number = scan.nextInt();
		boolean checkBinary = validateBinaryNumber(number);
		if(checkBinary)
			System.out.println("Entered number is binary :- "+ number);
		else
			System.out.println("Entered number is not Binary number :"+ number);
		scan.close();
	}

	private static boolean validateBinaryNumber(int number) {
		int dig = 0;
		while(number > 0) {
			dig = number % 10;
			if(dig != 0 && dig != 1)
				return false;
			number = number / 10;
		}
		return true;
	}
}
