/*
 * Vaja5_2
 * 
 * Izpis Števil iz območja odStevila do DoStevila, ki so deljiva s tri ali pet.
 * Primer izvajanja:
 * Od Števila: 10
 * Do Števila: 20
 * Deljiva Števila so:
 * 10, 12, 15, 18
 */

package vaja5;

import java.util.Scanner;

public class vaja5_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int nStart, nEnd;
		System.out.print("Input the starting value: ");
		nStart = input.nextInt();
		System.out.print("Input the ending value: ");
		nEnd = input.nextInt();
		input.close();
		
		if (nStart < nEnd && nStart >= 0 && nEnd > 1)
		{
			while (nStart < nEnd)
			{
				if (nStart % 3 == 0 || nStart % 5 == 0)
					System.out.print(nStart + ", ");
				++nStart;
			}
		}
		else
			System.out.print("You've made a logic error");

	}

}
