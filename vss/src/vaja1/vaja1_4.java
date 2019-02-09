/* 
 * Vaja1_4
 * Program za izračun ploščine in obsega pravokotnika.
 * Podatki pravokotnika:
 * Stranica a: 3.5
 * Stranica b: 2.45
 * Obseg pravokotnika je 11.9.
 * Ploščina pravokotnika je 8.575.
 */

package vaja1;

import java.util.Scanner;

public class vaja1_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, nPlo, nObs;
		
		System.out.print("Insert a: ");
		a = input.nextDouble();
		
		System.out.print("Insert b: ");
		b = input.nextDouble();
		input.close();
		
		nPlo = a * b;
		nObs = 2 * (a + b);
		
		System.out.printf("Obseg je %.3f, Ploscina je %.3f", nObs, nPlo);
	}
}
