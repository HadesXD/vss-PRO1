package kolokvij1;

/*
 * Vaja 6
 * 
 * Napišite metodo, ki vrne najveèji znak besedilnega vhodnega parametra.
 * public static char najvecjiZnak (String besedilo)  
 * Npr.  klic  najvecjiZnak ("ABCDEF12345abcdez") vrne vrednost 'z'.
 * Primerjava znakov glede na mesto v kodni tabeli.
 */

import java.util.Scanner;

public class ko_06 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input a string: ");
		String sValue = input.next();
		input.close();
		
		System.out.printf("The largest character is %c", largestChar(sValue));
	}
	
	public static char largestChar(String sValue) {
		char largest = ' ';
		
		for (int i = 0; i <= sValue.length() - 1; ++i)
			if (sValue.charAt(i) > largest)
				largest = sValue.charAt(i);
		
		return largest;	
	}
}