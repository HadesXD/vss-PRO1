/*
 * Vaja4_1
 * 
 * Program za izračun fakultete vnesenega celega Števila.
 * Število vnese uporabnik.
 * Izračun fakultete se izvaja dokler uporabnik na vpraŠanje "ŽeliŠ nadaljevati (D/N)?" ne odgovori z "N"
 */

package vaja4;

import java.util.Scanner;

public class vaja4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert n: ");
		int fac = 1, n = input.nextInt(), i = n;
		input.close();
		
		if (n <= 10 && n > 0)
			while (true) {
				fac *= i;
				--i;
				if (i < 1) {
					System.out.printf("Faculty %d = %d", n, fac);
					break;
				}
			}
		else
			System.out.println("Please input a number between 1 and 10");
	}

}
