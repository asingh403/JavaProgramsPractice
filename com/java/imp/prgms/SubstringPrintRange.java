package com.java.imp.prgms;

public class SubstringPrintRange {
	
	private String subStringRange(String str, int f, int l) {
		String st = str.substring(f, l);
		return st;
	}


	public static void main(String[] args) {
	    String S = 	"Helloworld";
	    int start = 3;
	    int end = 7;
	    
	    SubstringPrintRange sub = new SubstringPrintRange();
	    System.out.println(sub.subStringRange(S, start, end));
	    

	}

}
