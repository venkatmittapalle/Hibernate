package com.venki;

import java.util.*;

public class a4q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Alphabet : ");
		String letter = input.nextLine();
		if(letter.equals("a") || letter.equals("e") ||letter.equals("i") ||letter.equals("o") ||letter.equals("u") || 
		letter.equals("A") || letter.equals("E") ||letter.equals("I") ||letter.equals("O") ||letter.equals("U")) 
		{
			System.out.println("The letter " +letter + "  is a vowel") ;
		}
		else
		{
			System.out.println("The letter " +letter + "  is NOT a vowel");
		}

	}

}
