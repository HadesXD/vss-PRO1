/*
 * Vaja 2_4
 * 
 * Program  za osebo izpiše ali ima premajhno telesno težo ali ima normalno telesno težo ali 
 * ima preveliko telesno težo.
 * Uporabnik vnese višino v metrih in telesno težo v kilogramih.
 * 
 * Glede na ta dva podatka se izračuna koeficient po formuli koeficient = teža / (višina * višina).
 * Če je koeficient pod 18.5 => "premajhna teža", če je med 18.5 in 25.5 => "
 * normalna teža", sicer pa je teža "prevelika  teža".
 * 
 * Vnesi višino (metri) in težo osebe (kg): 1.72 64
 * Telesna teža je: normalna teža
 */

package vaja2;

import java.util.Scanner;

public class vaja2_4 {
	public static void main(String [] args) {
		double nHeight, nWeight, ko;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Height: ");
		nHeight = input.nextFloat();
		System.out.print("Weight: ");
		nWeight = input.nextFloat();
		input.close();
		
		ko = nWeight / (nHeight * nHeight);
		
		if (ko < 18.5)
			System.out.printf("Premajhna teža %.1f", ko);
		else if (ko > 18.5 && ko < 25.5)
			System.out.printf("Normlana teža %.1f", ko);
		else
			System.out.printf("Prevelika teža %.1f", ko);
			
		
		
	}
}
