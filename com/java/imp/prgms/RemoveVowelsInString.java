/**
 * Remove vowels from a string
 * LeetCode id : 1119
 */
package com.java.imp.prgms;

public class RemoveVowelsInString {

	public static void main(String[] args) {

		String strings = "Delhi is the Capital of INDIA";
		System.out.println(removeVowels(strings));

	}

	private static String removeVowels(String input) {

		String newString = input.replaceAll("[aeiouAEIOU]", "");

		return newString;
	}

}
