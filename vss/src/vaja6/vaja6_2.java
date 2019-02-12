/*
 * Vaja6_2
 * Print:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */

package vaja6;

import java.util.Scanner;

public class vaja6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int rows;
		System.out.print("Input the numer of rows:" );
		rows = input.nextInt();
		input.close();
		
		int spaces = rows - 1, stars = 1;
		
		while (rows != 0)
		{
			for (int i = 0; i < spaces; ++i)
				System.out.print(" ");
			for (int i = 0; i < stars; ++i)
				System.out.print("*");

			System.out.print("\n");

			stars += 2;
			--spaces;
			--rows;
		}
	}
}
