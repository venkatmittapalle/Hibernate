package com.venki;


import java.util.Scanner;
import java.lang.*;

class a4q6 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		double v=0;
		System.out.println("Enter the radius value : ");
		double r = input.nextDouble();
		System.out.println("Enter height : ");
		double h=input.nextDouble();
		double pie=Math.PI;
		v=pie*r*r*h;
		System.out.println("Volume of cylinder is : "+v);
		}
}