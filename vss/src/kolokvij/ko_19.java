package kolokvij1;

import java.util.Scanner;

/*
 * Vaja 19
 * 
 * Napišite metodo, ki izpiše šahovnico za doloèeno število vrstic (slika).
 * public static void izpisSahovnica (int steviloVrstic) 
 * Npr. klic  izpisSahovnica (8) izpiše:
 */

public class ko_19 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = 8;
		input.close();
		
		outputChess(n);
	}
	
	public static void outputChess(int n) {
		int change = 0;		
		for (int y = 1; y <= n; ++y) {
			for (int x = 1; x <= n; ++x) {
				if (change == 0) {
					change = 1;
					System.out.print("B");
				}
				else {
					change = 0;
					System.out.print("C");
				}
			}
			if (y % 2 == 0)
				change = 0;
			else
				change = 1;
			
			System.out.println();
		}
	}
}
