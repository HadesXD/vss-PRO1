package kolokvij1;

/*
 * Vaja1
 * 
 * Napi�ite metodo, ki vrne obrnjeno besedilo vhodnega parametra, ki je objekt razreda String.
 * Glava metode: public static String obrniBesedilo (String besedilo)
 * Npr. klic metode obrniBesedilo ("besedilo") vrne vrednost "olideseb".
 */

import java.util.Scanner;

public class ko_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("String: ");
		String sValue = input.next();
		input.close();
		
		System.out.printf("Original: %s\nBackwards: %s", sValue, backwards(sValue));
	}
	
	private static String backwards(String sValue) {
		String newString = "";
		
		for (int i = sValue.length() - 1; i >= 0; --i)
			newString += sValue.charAt(i);
		
		return newString;
	}
}