/*
 * Vaja1_6
 * Program prebere starost in težo treh študentov in izpiše povprečno starost in povprečno težo.
 * Vpiši starost in težo 1. študenta: 20 75
 * Vpiši starost in težo 2. študenta: 22 73
 * Vpiši starost in težo 3. študenta: 22 80
 * Povprečna starost: 21.3333
 * Povprečna teza: 76 
 */

package vaja1;

import java.util.Scanner;

public class vaja1_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		double nPov;
		
		System.out.print("Starost 1.student: ");
		n1 = input.nextInt();
		System.out.print("Starost 2.student: ");
		n2 = input.nextInt();
		System.out.print("Starost 3.student: ");
		n3 = input.nextInt();
		
		nPov = (double)(n1 + n2 + n3) / 3;
		System.out.printf("Povprecna starost je %.2f\n", nPov);
		
		System.out.print("Teza 1.student: ");
		n1 = input.nextInt();
		System.out.print("Teza 2.student: ");
		n2 = input.nextInt();
		System.out.print("Teza 3.student: ");
		n3 = input.nextInt();
		input.close();
		
		nPov = (double)(n1 + n2 + n3) / 3;
		System.out.printf("Povprecna teza je %.2f\n", nPov);
	}
}
