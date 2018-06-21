package com.venki;

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


public class a4q11 {

	public static void main(String[] args) {
		  int monthdays[] = {
			      0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Date : ");
		int date = input.nextInt();
		System.out.println("Enter the Month : ");
		int mon = input.nextInt();
		System.out.println("Enter the Year : ");
		int year = input.nextInt();
		
        int days = ((year-1990) * 365)  + ( (year - 1900) / 4); 
        //System.out.println(days);

        if(( ( year % 4 == 0) && (year % 100 != 0) || year % 400 ==0 )  &&  (mon==1 || mon==2) ) {
        		days = days-1;
        		//System.out.println(days);
        }
        int mons = mon - 1;
        for (int i = 0; i <=mons; i++) {
        	days = days + monthdays[i];//+date;
        }
        days+=date-1;
        int week = days % 7;
        if(week == 0) {
        	System.out.println("Sunday");
        }
        else if(week == 1) {
        	System.out.println("Monday");
        }
        else if(week == 2) {
        	System.out.println("Tuesday");
        }
        else if(week == 3) {
        	System.out.println("Wednesday");
        }
        else if(week == 4) {
        	System.out.println("Thursday");
        }
        else if(week == 5) {
        	System.out.println("Friday");
        }
        else if(week == 6) {
        	System.out.println("Saturday");
        }
	}
}
