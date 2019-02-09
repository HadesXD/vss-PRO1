/*
 * Vaja2_3
 * Uporabnik za tri študente vnese višino študentov. Program izpiše višine študentov po 
 * vrsti od največjega do najmanjšega.
 * Višina 1. študenta: 180
 * Višina 2. študenta: 185
 * Višina 3. študenta: 165
 * Urejene višine študentov: 185, 180, 165.
 */

package vaja2;

import java.util.Scanner;

public class vaja2_3 {
	public static void main(String[] args) {
		int v1, v2, v3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("V1:");
		v1 = input.nextInt();
		System.out.print("V2:");
		v2 = input.nextInt();
		System.out.print("V3:");
		v3 = input.nextInt();
		input.close();
		
		if (v1 > v2 && v2 > v3 && v1 > v3)
			System.out.printf("%d, %d, %d",v1, v2, v3); //v1 > v2 > v3
		else if (v1 > v2 && v2 < v3 && v1 > v3)
			System.out.printf("%d, %d, %d",v1, v3, v2); //v1 > v3 > v2
		else if (v1 < v2 && v2 > v3 && v1 > v3)
			System.out.printf("%d, %d, %d",v2, v1, v3); //v2 > v1 > v3
		else if (v1 < v2 && v2 > v3 && v1 < v3)
			System.out.printf("%d, %d, %d",v2, v3, v1); //v2 > v3 > v1
		else if (v1 > v2 && v2 < v3 && v1 < v3)
			System.out.printf("%d, %d, %d",v3, v1, v2); //v3 > v1 > v2
		else if (v1 < v2 && v2 < v3 && v1 < v3)
			System.out.printf("%d, %d, %d",v3, v2, v1); //v3 > v2 > v1
		else
			System.out.print("Error!");
				
	}
}
