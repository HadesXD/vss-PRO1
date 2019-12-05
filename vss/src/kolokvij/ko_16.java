package kolokvij1;

/*
 * Vaja 16
 * 
 * Napišite metodo, ki izpiše èrko H z doloèenim številom vrstic in stolpcev (slika).
 * public static void izpisZnakH (int steviloVrstic, int steviloStolpcev) 
 * Npr. klic  izpisZnakH (5, 4) izpiše:
 */

import java.util.Scanner;

public class ko_16 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Rows: ");
		int row = input.nextInt();
		System.out.print("Cols: ");
		int col = input.nextInt();
		input.close();
		
		outputChar(row, col);
	}
	
	public static void outputChar (int row, int cols) {
		int half = (row / 2) +1;
		
		for (int y = 1; y <= row; ++y) {
			if (y == half)
				for (int x = 1; x <= cols; ++x)
					System.out.print("*");
			else 
				for (int x = 1; x <= cols; ++x) {
					if (x == 1 || x == cols)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
		}
	}
}
