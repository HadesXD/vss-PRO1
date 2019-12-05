package kolokvij1;

/*
 * Vaja 4
 * 
 * Napišite metodo, ki vrne najveèjo števko oz. cifro celoštevilènega vhodnega parametra.
 * public static int najvecjaStevka (long stevilo)  
 * Npr.  klic  najvecjaStevka (2831) vrne vrednost 8.
 */

import java.util.Scanner;

public class ko_04 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input a value: ");
		int n = input.nextInt();
		input.close();
		
		System.out.printf("The largest digit is %d!", largestDigit(n));
	}

	public static int largestDigit(int n) {
		int largest = 0;
		int temp;
		
		while (n > 0) {
			temp = n % 10;
			n /= 10;
			
			if (temp > largest)
				largest = temp;
		}
		
		return largest;
	}
}