/*
 * Vaja1_3
 * Program za izračun vsote dveh vnesenih celih števil.
 * Vpiši dve celi števili: 45 78
 * Prvo število je: 45
 * Drugo število je: 78
 * Vsota števil je 123.
 */

package vaja1;

import java.util.Scanner;

public class vaja1_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, nSum;
		
		System.out.print("Insert a: ");
		a = input.nextInt();
		
		System.out.print("Insert b: ");
		b = input.nextInt();
		input.close();
		
		nSum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, nSum);
	}
}
