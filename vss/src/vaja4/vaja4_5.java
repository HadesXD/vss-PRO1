/*
 * Vaja4_5
 * 
 * Izračun vsote N členov zaporedja i * (i-1); i = 1 .. N
 * Izpis vsebuje posamezne člene zaporedja.
 * Uporaba zanke while.Â 
 */

package vaja4;

import java.util.Scanner;

public class vaja4_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int nNums, n = 0, nSum = 0;
		System.out.print("Inser the number of Ns: ");
		nNums = input.nextInt();
		input.close();
		
		while (n != nNums)
		{
			++n;
			System.out.println(n * (n - 1));
			nSum += (n * (n - 1));
		}
		
		System.out.print("The sum is " + nSum);
		
	}

}
