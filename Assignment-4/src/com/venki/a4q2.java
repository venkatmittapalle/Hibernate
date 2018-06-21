package com.venki;

import java.util.Scanner;

import java.lang.String;
class a4q2 {
		public static void main(String args[]) {
			Scanner input=new Scanner(System.in); 
			float diff; int SumofSquare,SquareofSum;
			System.out.println("Enter the n value : ");
			int n=input.nextInt();
			SumofSquare = (n*(n+1)*(2*n+1))/6;   
			SquareofSum = (n*(n+1))/2;   
			SquareofSum = SquareofSum*SquareofSum;     
			diff = (float) (SquareofSum-SumofSquare);
			System.out.println("difference between sum of the squares and the square of the sums of "+n+" numbers is : " +diff);
			}
}
