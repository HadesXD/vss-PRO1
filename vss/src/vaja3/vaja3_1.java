/*
 * Program za deset vnesenih celih �tevil izpi�e �tevilo pozitivnih in �tevilo negativnih �tevil.
 */

package vaja3;

import java.util.Scanner;

public class vaja3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, nSumPoz = 0, nSumNeg = 0, st=0;
		
		while (st < 10) {
			++st;
			System.out.printf("Vnesi �tevilo %d:", st);
			n = input.nextInt();
			
			if (n > 0)
				++nSumPoz;
			else
				++nSumNeg;
		}
		
		input.close();
		System.out.printf("%d pozitivnih, %d negativnih", nSumPoz, nSumNeg);
	}
}
