package com.edu.les02.main;

public class ExpressionValue {

	public static void main(String[] args) {
		double expressionValue;
		double a = 8;
		double b = 31;
		int c = 12;
		expressionValue = (b + Math.sqrt (Math.pow (b, 2) + 4 * a * c)) / (2 * a) - Math.pow ( a, 3) * c + Math.pow (b, -2);
		System.out.println(expressionValue);
		}

}
