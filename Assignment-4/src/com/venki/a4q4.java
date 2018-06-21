package com.venki;


import java.util.Scanner;

import java.lang.*;

class a4q4 {

	public static void main(String args[]) {
		    Scanner input=new Scanner(System.in);
			System.out.println("Enter a area value : ");
			double n=input.nextDouble();
			double s=Math.sqrt(n);
			double perimeter=4*s;
			System.out.println("Perimeter is : "+perimeter);
			}

}
