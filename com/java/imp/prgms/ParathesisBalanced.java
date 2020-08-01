/**
 * WAP Java balanced expressions check {[()]}
 */

package com.java.imp.prgms;

import java.util.Stack;

public class ParathesisBalanced {

	public static boolean isBalanced(String str) {
		if ((str.length() % 2) == 1)
			return false;
		else {
			Stack<Character> s = new Stack<>();
			for (char bracket : str.toCharArray())
				switch (bracket) {
				case '{':
					s.push('}');
					break;
				case '(':
					s.push(')');
					break;
				case '[':
					s.push(']');
					break;
				default:
					if (s.isEmpty() || bracket != s.peek()) {
						return false;
					}
					s.pop();
				}
			return s.isEmpty();
		}
	}

	public static void main(String[] args) {
		
		String str = "{[()]}(";
		boolean answer = isBalanced(str);
		
		if (answer) {
			System.out.println(str + "  Balanced --> YES");
		} else {
			System.out.println(str + "  Balanced --> NO");
		}

	}

}
