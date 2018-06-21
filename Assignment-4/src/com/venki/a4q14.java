package com.venki;

import java.util.*;
import java.lang.String;

public class a4q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age = input.nextInt();
		
		System.out.println("\n1.Male\n2.Female\nEnter your Gender: ");
		int sex = input.nextInt();
		
		System.out.println("1.Self- Employed \n2.Professional \n3.Retired \nEnter your Job Status  : ");
		int job = input.nextInt();
		
		System.out.println("Enter your Total Assests : ");
		double assests = input.nextDouble();
		
		if(assests>=25000) {
			if( (age >=16) && (age <=25) ) {
				if(job==3) {
					System.out.println("Enter your valid information");
				}
				else if(job==1) {
					System.out.println("Your eligible loan amount is 10000");
				}
				else if(job==2) {
					System.out.println("Your eligible loan amount is 15000");
				}
				
				
			}
			
			else if(age>60) {
				if(job==2) {
					System.out.println("Enter your valid information");
				}
				else if(job==1) {
					float loan = (float) (35000-(age*100));
					System.out.println("Your eligible loan amount is 35000-Age*100 : " +loan);
				}
				else if(job==3) {
					float loan = (float) (25000-(age*100));
					System.out.println("Your eligible loan amount is 25000-Age*100 : " +loan);
				}
				
			}
			
			else if( (age >=26) && (age <=40) ) {
				if( assests>=40000 ) {
					if(job!=3) {
						if(sex==1) {
							System.out.println("Your eligible loan amount is 25000");
						}
						else if(sex==2){
							System.out.println("Your eligible loan amount is 30000");
						}
					}
						else {
							System.out.println("Enter your valid information");
						}
				}
			}
			
			else if( (age >=41) && (age <=60) ) {
				if( assests>=50000 && job!=3) {
					System.out.println("Your eligible loan amount is 40000");	
				}
				else {
					System.out.println("Enter your valid information");
				}
			}
		}
		
			
		else {
			System.out.println("To eligible for loan you should have minimum assests above 25000!");
		}
	}

}
