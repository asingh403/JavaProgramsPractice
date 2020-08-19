package com.java.imp.prgms;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println("Before :: "+ str);
		System.out.println(revString(str));
	}
	
	private static char[] revString(String s) {
		
		char [] ch = new char [s.length()];
		s.getChars(0, s.length(), ch, 0);
		
		int i = 0, j = s.length()-1;
		
		while(i<j) {
			char temp = ch[i];
			
			ch[i++] = ch[j];
			
			ch[j--] = temp;
		}
		return ch;
		
	}

}
