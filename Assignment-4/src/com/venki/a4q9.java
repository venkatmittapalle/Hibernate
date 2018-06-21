package com.venki;

import java.util.*;

public class a4q9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your total charges : ");
		float amt = input.nextFloat();
		if(amt<=500) {
			float cashabck = (float) (amt*0.0025);
			System.out.println("The Total cashback you have earned is : " +cashabck);
		}
		else if((amt > 500) && (amt <=1500)) {
			float cashabck = (float) (amt*0.0050);
			System.out.println("The Total cashback you have earned is : " +cashabck);
		}
		else if((amt > 1500) && (amt <=2500)) {
			float cashabck = (float) (amt*0.0075);
			System.out.println("The Total cashback you have earned is : " +cashabck);
		}
		else {
			float cashabck = (float) (amt*0.01);
			System.out.println("The Total cashback you have earned is : " +cashabck);	
		}
	}

}
