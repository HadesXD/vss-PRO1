/*
 * Program s pomočjo zvezdic izriŠe pravokotnik dimenzij 
 * a (Število stolpcev) in b (Število vrstic).
 * Dimenzije vnese uporabnik.
 */

package vaja3;

import java.util.Scanner;

public class vaja3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int column, row;
		
		System.out.print("Vnesi vrstice: ");
		row = input.nextInt();
		System.out.print("Vnesi stoplce: ");
		column = input.nextInt();
		input.close();
		
		for (int i = 0; i < row; ++i) {
			System.out.print("\n");
			for (int j = 0; j < column; ++j)
				System.out.print("*");
		}
	}
}
