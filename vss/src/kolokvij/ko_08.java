package kolokvij1;

/*
 * Vaja 8
 * 
 * Napišite metodo, ki glede na vhodni parameter mesec vrne število dni v mesecu.
 * public static int steviloDni(int mesec)  
 * Npr. klic  steviloDni (3) vrne vrednost 31. 
 */

import java.util.Scanner;

public class ko_08 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month from 1-12: ");
		int n = input.nextInt();
		input.close();
		
		System.out.printf("The number of days for the %d. are %d!", n, steviloDni(n));
	}
	
	public static int steviloDni(int n) {
		switch(n) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				n = 31;
				break;
			case 2:
				n = 28;
				break;
			case 4: case 6: case 9: case 11:
				n = 30;
				break;
			default:
				System.out.println("Logic error");
		}
		return n;
	}
}
