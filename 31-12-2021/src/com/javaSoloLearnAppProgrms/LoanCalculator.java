package com.javaSoloLearnAppProgrms;

import java.util.Scanner;

public class LoanCalculator 
{
	// WAP for the Loan Amount with below Requirement
			/**
			 	You take a loan from a friend and need to calculate how much you will owe him after 3 months.
				You are going to pay him back 10% of the remaining loan amount each month.
				Create a program that takes the loan amount as input, 
				calculates and outputs the remaining amount after 3 months.
			 **/
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Loan Amount");
		int amount = scn.nextInt();
		
			for(int i=1; i<=3; i++)
			{
				int loan = (amount*10)/100;
				amount = amount - loan;
			}
		System.out.println(amount);

		scn.close();
	}

}
