package com.basics;

public class Square_Numbers_Formula 
{
	/**
	 * Write a java program to print square of two numbers.
	 */
	
	public static void main(String[] args)
	{
		int a = 2, b = 4, square;
		
		square = (a*a) + (2*a*b) + (b*b);
		
		/**
		 * square = 2*2 + 2*2*4 + 4*4
		 * 
		 * square = 4 + 16 + 16 
		 * 
		 * square = 36
		 */
		
		System.out.println(square);

	}

}
