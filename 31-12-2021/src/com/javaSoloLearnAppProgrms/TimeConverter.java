package com.javaSoloLearnAppProgrms;

import java.util.Scanner;

public class TimeConverter

{	// WAP to convert the Days into Seconds 

	public static void main(String[] args)
	
	{	
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter the No. of Days to be converted into Seconds ");
		
		int days = scn.nextInt();
		
		int hours = days*24;
		int minutes = hours*60;
		int seconds = minutes*60;
		
		System.out.println(seconds);
	
		scn.close();
		
	}

	
}

