/*
 * Vaja4_2
 * 
 * Program v tabelo nakljucna ustvari 100 naključnih Števil iz intervala od 50 do 500.
 * Program iz tabele izpiŠe Števila, ki so deljiva z 2 ali s 4 ali s 7 po 10 Števil v posamezni vrstici.
 * Na koncu izpiŠe Še Število teh Števil.Â Â 
 */

package vaja4;

import java.util.Random;

public class vaja4_2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n, st = 0, row = 0, i = 0;
		
		while(st < 100)
		{
			n = rand.nextInt(500) + 50;
			++st;
			
			if (n % 2 == 0 || n % 4 == 0 || n % 7 == 0)
			{
				if (row < 10) {
					System.out.printf(" %d ", n);
					++row;
				}
				else {
					System.out.print("\n");
					row = 0;
				}
			}
			else
				++i;
		}
		
		System.out.printf("\n Število naključnih števil, ki izpolnjujejo pogoj je %d.", i);
	}
}
