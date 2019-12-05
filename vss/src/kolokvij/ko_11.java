package kolokvij1;

/*
 * Vaja 11
 * 
 * Napišite metodo, ki izpiše trikotnik z doloèenim številom vrstic (slika).
 * public static void izpisTrikotnik2 (int steviloVrstic) 
 * npr. klic  izpisTrikotnik2 (6) izpiše:
 */

import java.util.Scanner;

public class ko_11 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("The size of the triangle: ");
		int n = input.nextInt();
		input.close();
		
		ouputTriangle(n);
	}
	
	public static void ouputTriangle(int nValue) {
		int n = 1, cols = nValue;
		
		for (int x = 0; x < nValue - 1; ++x) {
			for (int y = 0; y < cols; ++y) {
				System.out.printf("%5d", n);
				n *= 4;
			}
			n = 1;
			System.out.println();
			--cols;
		}
	}
}
