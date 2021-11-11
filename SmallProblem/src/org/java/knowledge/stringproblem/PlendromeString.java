package org.java.knowledge.stringproblem;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sagar_Naik_11_11_2021
 * To check string is palindrome or not
 *
 */
public class PlendromeString {

	public static void main(String[] args) {
		
		System.out.println("check string is palendrem "+isogram("sag"));
		
	}
	
	static boolean isogram(String str) {
		boolean flag = true;
		char [] ch = str.toCharArray();
		Set<Character> chSet = new HashSet<>();		
		for (Character c : ch) {
			if(chSet.contains(c))
				flag = false;
			else
				chSet.add(c);
		}		
		return flag;

	}

}
