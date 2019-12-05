package kolokvij1;

/*
 * Vaja 18
 * 
 * Napišite metodo, ki izpiše èrko E z doloèenim številom vrstic in stolpcev (slika).
 * public static void izpisZnakE (int steviloVrstic, int steviloStolpcev) 
 * Npr. klic  izpisZnakE (5, 4) izpiše:
 */

import java.util.Scanner;

public class ko_18 {

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
			for (int x = 1; x <= cols; ++x) {
				if (y != 1 && y != row && y != half) {
					if (x == 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

