/*
 * Program s pomočjo zvezdic izriŠe pravokotni trikotnik.
 * Uporabnik vnese višino trikotnika (Število vrstic)
 */

package vaja3;

import java.util.Scanner;

public class vaja3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, x;
		
		System.out.print("Vnesi število vrstic: ");
		n = input.nextInt();
		input.close();
				
		for (int i = 0; i < n; --n) {
			System.out.print("\n");
			x = n;
			for (int j = 0; j < x; --x) 
				System.out.print("*");
		}
	}

}
