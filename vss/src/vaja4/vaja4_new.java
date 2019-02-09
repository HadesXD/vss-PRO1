/*
 * Print Ls
 */

package vaja4;

import java.util.Scanner;

public class vaja4_new {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int row, col;
		
		System.out.print("Insert num of rows: ");
		row = input.nextInt();
		System.out.print("Insert num of columns: ");
		col = input.nextInt();
		input.close();
		
		while (row != 0) {
			System.out.println("*");
			if (row == 1)
				while (col != 0) {
					System.out.print("*");
					--col;
				}
			--row;
		}
	}

}
