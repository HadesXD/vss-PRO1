package kolokvij1;

/*
 * Vaja 2
 * 
 * Napišite metodo, ki vrne število loèil v besedilu. Za loèila 
 * upoštevajte znake '.', ',', '!'. '?', ';'. 
 * public static int steviloLocil (String besedilo) 
 * Npr. klic metode  steviloLocil ("Stavek1. Stavek2? Stavek tri.") vrne vrednost 3.
 */

import java.util.Scanner;

public class ko_02 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("String: ");
		String sValue = input.nextLine();
		input.close();
		
		System.out.printf("The number is: %d", numPunc(sValue));
	}
	
	public static int numPunc(String sValue) {
		int num = 0;
		char current;
		
		for (int i = 0; i < sValue.length(); ++i) {
			current = sValue.charAt(i);
			if (current == '.' || current == ',' || current == '!' || current == '?'
					|| current == ';')
				++num;
		}
				
		return num;
	}
}