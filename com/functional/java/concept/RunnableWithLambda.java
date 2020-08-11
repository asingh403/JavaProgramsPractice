package com.functional.java.concept;

public class RunnableWithLambda {

	public static void main(String[] args) {
		Runnable r = () -> {
			int i = 0;
			while (i++ < 10) {
				System.out.println("Its works !!");
			}
		};

	}
}
