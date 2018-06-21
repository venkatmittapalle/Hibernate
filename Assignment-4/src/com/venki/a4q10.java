package com.venki;

import java.io.*;

import java.util.Scanner;

class a4q10 {

		public static void main(String args[]) throws IOException {

				Scanner input=new Scanner(System.in);
				System.out.println("Enter the number of attendes for show : ");
				int a=input.nextInt();
				double percost = 20 ;
				double attendecost =0.5;
				double profit = (5*a)-(a*attendecost+20);
				System.out.println("The profit for the show is : $"+profit);
		}
}