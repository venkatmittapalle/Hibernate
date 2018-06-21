package com.venki;

import java.util.*;

public class a4q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Gross Pay :");
		float amt = input.nextFloat();
		if(amt <= 240) {
			float tax = (float) (amt);
			float totaltax = tax;
			System.out.println("the amount of tax owed : " +totaltax);
		}
		else if((amt > 240) && (amt <=480) ) {
			float tax = (float) (amt*0.15);
			float totaltax = tax+amt;
			System.out.println("the amount of tax owed : " +totaltax);
		}
		
		else {
			float tax = (float) (amt*0.28);
			float totaltax = tax+amt;
			System.out.println("the amount of tax owed : " +totaltax);
		}
	}

}
