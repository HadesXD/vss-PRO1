package kolokvij1;

/*
 * Vaja 9
 * 
 * Napišite metodo, ki vrne vsoto celih števil iz intervala odStevila do doStevila, ki so deljiva s 3 ali 4.
 * public static int vsotaOdDoX (int odStevila, int doStevila) 
 * Npr. klic  vsotaOdDoX (4,12) vrne vrednost 39.
 */

import java.util.Scanner;

public class ko_09 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("From: ");
		int n1 = input.nextInt();
		System.out.print("To: ");
		int n2 = input.nextInt();
		input.close();
		
		if (!(n1 > n2))
			System.out.printf("The sum is %d", sumFromToX(n1, n2));
		else
			System.out.print("Logic error");
	}
	
	public static int sumFromToX(int fromN, int toN) {
		int sum = 0;
		
		for (;fromN <= toN; ++fromN)
			if (fromN % 3 == 0 || fromN % 4 == 0)
				sum += fromN;
		
		return sum;
	}
}
