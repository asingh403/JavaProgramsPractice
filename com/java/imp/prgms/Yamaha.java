package com.java.imp.prgms;

public class Yamaha {

	public static void main(String[] args) {

		String input = "Yamaha";

		Yamaha yamahaObj = new Yamaha();

		String result = yamahaObj.newIncreaseString(input);

		System.out.println(result);

	}

	private String newIncreaseString(String input) {

		int count = 0;
		String output = "";

		for (int i = 0; i < input.length(); i++) {

			if (String.valueOf(input.charAt(i)).equals("a")) {

				for (int j = 0; j < count; j++)
					output = output + 'a';
				count = count + 2;

			} else
				output = output + input.charAt(i);
		}
		return output;
	}
}
