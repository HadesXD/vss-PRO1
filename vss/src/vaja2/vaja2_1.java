/*
 * Vaja2_1
 * 
 * Program, ki za dve vneseni realni števili izpiše vrednosti 
 * relacijskih izrazov: >, >=, <, <=, !=,  ==.
 */

package vaja2;

import java.util.Scanner;

public class vaja2_1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int a, b;
		
		System.out.print("a: ");
		a = input.nextInt();
		
		System.out.print("b: ");
		b = input.nextInt();
		input.close();
		
		System.out.printf(" a > b is %b\n a >= b is %b\n a < b is %b\n a <= b is %b\n"
				+ " a == b is %b\n a != b is %b", a > b, a >= b, a < b, a <= b, a == b, a != b);
	}
}
