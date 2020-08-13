package com.functional.java.concept;

import java.util.Comparator;

public class ComparatorWithLambda {

	public static void main(String[] args) {
		String s1 = "Gonda";
		String s2 = "Gonda";
		
		ComparatorWithLambda cwl = new ComparatorWithLambda();
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
								
				return Integer.compare(s1.length(), s2.length());
			}
		};	
	}
}
