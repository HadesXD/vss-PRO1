package kolokvij1;

/*
 * Vaja 12
 * 
 * Napišite metodo, ki izpiše trikotnik z doloèenim številom vrstic (slika).
 * public static void izpisTrikotnik4 (int steviloVrstic) 
 * Npr. klic  izpisTrikotnik4 (6) izpiše:
 */

import java.util.Scanner;

public class ko_12 {

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
			
		for (int x = 0; x < nValue ; ++x) {
			for (int y = 0; y < cols; ++y) {
				System.out.printf("%3d", n);
			}
			System.out.println();
			--cols;
		}
	}
}
