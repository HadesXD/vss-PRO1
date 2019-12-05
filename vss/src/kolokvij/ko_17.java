package kolokvij1;

/*
 * Vaja 17
 * 
 * Napišite metodo, ki izpiše èrko U z doloèenim številom vrstic in stolpcev (slika).
 * public static void izpisZnakU (int steviloVrstic, int steviloStolpcev) 
 * Npr. klic  izpisZnakU (5, 4) izpiše:
 */

import java.util.Scanner;

public class ko_17 {

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
		for (int y = 1; y <= row; ++y) {
				for (int x = 1; x <= cols; ++x) {
					if (y != row) {
						if (x == 1 || x == cols)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					else
						System.out.print("*");
				}
			System.out.println();
		}
	}
}
