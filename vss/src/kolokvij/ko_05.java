package kolokvij1;

/* 
 * Vaja 5
 * 
 * Napi�ite metodo, ki vrne izbrano opcijo menija, ki jo izbere uporabnik.
 * Opcije menija so:
 * 1 - izpis lika trikotnika
 * 2 - izpis lika kvadrata
 * 3 - izpis lika pravokotnika
 * 0 - konec dela
 * public static int meniIzbor () 
 * Npr. klic metode  meniIzbor () vrne eno izmed vrednosti (1, 2, 3, 0).
 * Opcije menija se izpisujejo dokler uporabnik ne izbere ene izmen ponujenih mo�nosti.
 */

import java.util.Scanner;

public class ko_05 {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Select between 0, 1, 2 or 3!: ");
		int nValue = -1, returnedValue = 0;
		
		while (nValue != 0 && nValue != 1 && nValue != 2 && nValue != 3) {
			nValue = input.nextInt();
			returnedValue = menu(nValue);
		}
		
		input.close();
		
		System.out.printf("Return value is %d", returnedValue);
	}
	
	public static int menu(int nValue) {
		switch(nValue) {
			case 0:
				System.out.println("Izpis trikotnika");
				break;
			case 1:
				System.out.println("Izpis kvadrata");
				break;
			case 2:
				System.out.println("Izpis pravokotnika");
				break;
			case 3:
				System.out.println("Konec dela");
				break;
			default:
				System.out.println("Please input a value between 0 and 3");
		}
		
		return nValue;
	}
}