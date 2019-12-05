package kolokvij1;

/*
 * Vaja 14
 * 
 * Napišite metodo, ki vrne true, èe je leto prestopno in false, èe leto ni prestopno.  
 * public static boolean prestopnoLeto(int leto) 
 * Npr. klic  prestopnoLeto (1900) vrne false.
 * 
 * Prestopno leto je leto s 366 dnevi (februar ima 29 dni). 
 * Pravila za prestopno leto:
 * 1. Leto je prestopno, èe je deljivo s 4, razen ...
 * 2. ... v primeru, da je leto deljivo s 100, leto ni prestopno, razen ...
 * 3. ... v primeru, da je leto deljivo s 400, leto je prestopno.
 */

import java.util.Scanner;

public class ko_14 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Year: ");
		int year = input.nextInt();
		input.close();
		
		System.out.printf("The year %d is %b.", year, preprostnoLeto(year));
	}
	
	public static boolean preprostnoLeto(int year) {
		if (year % 4 == 0 && year % 400 == 0)
			return true;
		
		return false;
	}

}
