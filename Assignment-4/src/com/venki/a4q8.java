package com.venki;


import java.util.*;

import java.text.*;

public class a4q8 {

		public static void main (String[] args) {
			double trate=0.15;
			double hrate=12;
			Scanner input=new Scanner(System.in);
			System.out.println("Enter number of days worked in a year:");
			int days=input.nextInt();
			System.out.print("Enter number of working hours: ");
			double hrs=input.nextDouble();
			double gpay=days*hrs*hrate;
			double tax=gpay*trate;
			double netpay=gpay-tax;
			System.out.println("Net Pay is : $"+netpay);
			}
}
