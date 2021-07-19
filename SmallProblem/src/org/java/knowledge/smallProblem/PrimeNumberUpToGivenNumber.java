package org.java.knowledge.smallProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberUpToGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("check prime number upto given number :- ");
		int number = scan.nextInt();		
		List<Integer> primeArray = checkPrimeUpToNumber(number);
		System.out.println("All prime number up to given number :- "+ primeArray);
		scan.close();
	}

	private static List<Integer> checkPrimeUpToNumber(int number) {
		int count = 2, count1;
		List<Integer> primeNum = new ArrayList<Integer>();
		while (number-1 > count ) {
			count1 = 2;
			while (count >= count1 ) {
				if(count % count1 == 0 )
					break;
				count1++;				
			}
			if(count == count1)
				primeNum.add(count1);			
			count++;
			
		}
		return primeNum;
	}
}
