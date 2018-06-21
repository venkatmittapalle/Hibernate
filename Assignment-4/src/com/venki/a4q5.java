package com.venki;

import java.util.*;

public class a4q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		float amt = input.nextFloat();
		if(amt<=1000) {
			float deposit =(float) (amt*0.04);
			float totalamt = deposit+amt; 
			System.out.println("Your total amount with interest : " +totalamt);
		}
		else if((amt>1000) && (amt<=5000)) {
			float deposit =(float) (amt*0.045);
			float totalamt = deposit+amt; 
			System.out.println("Your total amount with interest : " +totalamt);
		}
		else {
			float deposit =(float) (amt*0.05);
			float totalamt = deposit+amt; 
			System.out.println("Your total amount with interest : " +totalamt);
		}
	}

}
