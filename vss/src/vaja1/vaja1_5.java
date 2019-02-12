/* 
 * Vaja1_5
 * 
 * Program prebere celoštevilčni vrednosti dveh spremenljivk x in y.
 * Program zamenja vrednosti spremenljivk in izpiše nove vrednosti na zaslon.
 * Vpiši dve celi stevili: 45 56
 * Začetna vrednost spremenljivke x je 45.
 * Začetna vrednost spremenljivke y je 56.
 * Zamenjava vrednosti spremenljivk x <= => y.
 * Nova vrednost spremenljivke x je 56.
 * Nova vrednost spremenljivke y je 45.
 */


package vaja1;

import java.util.Scanner;

public class vaja1_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, i;
		
		System.out.print("x is: ");
		x = input.nextInt();
		System.out.print("y is: ");
		y = input.nextInt();
		input.close();
		
		System.out.printf("old x is %d\n", x);
		i = x;
		x = y;
		System.out.printf("new x is %d\n", x);
		
		System.out.printf("old y is %d\n", y);
		y = i;
		System.out.printf("new y is %d\n", y);
	}
}
