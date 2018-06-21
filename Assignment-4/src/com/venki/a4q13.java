package com.venki;

import java.util.Scanner;

public class a4q13 {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		double p=input.nextDouble();
		System.out.println("Enter the annual interest rate in percentage : ");
		double ir=input.nextDouble();
		System.out.println("Enter the number of months : ");
		double m=input.nextDouble();
		double ad=p*(m/12)*(ir/100);
		double finalbal=p+ad;
		System.out.print("Final balance will be "+finalbal);
	}
}

