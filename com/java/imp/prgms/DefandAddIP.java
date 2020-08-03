/**
* LeetCode ID  : 1108
* Program Name : DefangIP Adde
**/

package com.java.imp.prgms;

public class DefandAddIP {

	public static void main(String[] args) {
		
		String address = "1.1.1.1";
		
		String output = defangIPaddr(address);
		System.out.println(output);
	}
	private static String defangIPaddr(String input ) {
		
		StringBuilder ip = new StringBuilder();
		
		for(char ch : input.toCharArray()) {
			ip.append(ch == '.' ? "[.]":ch);
		}
		return ip.toString();
	}
}
