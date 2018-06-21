package com.venki;

import java.util.Scanner;

public class a4q12 {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the time in seconds : ");
			double time=input.nextDouble();
			double acc;
			double g=9.8;
			acc=g;
			double vel=acc*time;
			double h=(vel*time)/2;
			System.out.println("Height reached by the rocket (in km) is : " +(h/1000));
		}
}
