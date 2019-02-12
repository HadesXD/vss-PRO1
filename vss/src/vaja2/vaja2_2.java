/*
 * Vaja2_2
 * 
 * Program, ki za tri vnesena realna števila preveri, če velja  tranzitivnost: 
 * x > y    in   y > z   sledi (=>)  x > z
 * Vnesi tri števila (x y z): 67 56 54
 * 67>56 in 67>54 => 67>54: Pravilo tranzitivnosti velja.
 */

package vaja2;

import java.util.Scanner;

public class vaja2_2 {
	public static void main(String[] args) {
		float x,y,z;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Insert x: ");
		x = input.nextFloat();
		System.out.print("Insert y: ");
		y = input.nextFloat();
		System.out.print("Insert z: ");
		z = input.nextFloat();
		input.close();
		
		if (x > y && x > z)
			System.out.printf("%.2f > %.2f and %.2f > %.2f => "
					+ "%.2f > %.2f: Pravilno ranzitivnost velja.", x, y, x, z, x, z);
		else
			System.out.print("Pravilno ranzitivnost nevelja.");
	}
}
