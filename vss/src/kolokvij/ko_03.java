package kolokvij1;

/*
 * Vaja 3
 * 
 * Napi�ite metodo, ki vrne izbrano opcijo menija, ki jo izbere uporabnik.
 * Opcije menija so:
 * A - izpis lika trikotnika
 * B - izpis lika kvadrata
 * C - izpis lika pravokotnika
 * K - konec dela
 * public static char meniIzbor () 
 * Npr. klic metode  meniIzbor () vrne eno izmed vrednosti ('A', 'B', 'C', 'K').
 * Opcije menija se izpisujejo dokler uporabnik ne izbere ene izmen ponujenih mo�nosti.
 */

import java.util.Scanner;

public class ko_03 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Select between A, B, C or K: ");
		char cValue = ' ';
		char returendValue = ' ';
		
		while (cValue != 'A' && cValue != 'B' && cValue != 'C' && cValue != 'K') {
			cValue = Character.toUpperCase(input.next().charAt(0));
			returendValue = menu(cValue);
		}
		
		input.close();
		
		System.out.printf("Returned value is %c", returendValue);
	}
	
	public static char menu(char cValue) {
		
		switch (cValue) {
			case 'A':
				System.out.println("Izpis trikotnika");
				break;
			case 'B':
				System.out.println("Izpis kvadrat");
				break;
			case 'C':
				System.out.println("Izpis pravokotnik");
				break;
			case 'K':
				System.out.println("Konec dela.");
				break;
			default:
				System.out.println("Please input value A, B, C or K!");
		}
		
		return cValue;		
	}
}

