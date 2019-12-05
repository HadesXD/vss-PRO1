package kolokvij1;

/*
 * Vaja 10
 * 
 * Napišite metodo, ki izraèuna produkt celih števil iz intervala odStevila do doStevila, ki so deljiva s 5.
 * public static int produktOdDoY (int odStevila, int doStevila) 
 * Npr. klic  produktOdDoY (1,10) vrne vrednost 50.
 */

import java.util.Scanner;

public class ko_10 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("From: ");
		int n1 = input.nextInt();
		System.out.print("To: ");
		int n2 = input.nextInt();
		input.close();
		
		if (!(n1 > n2))
			System.out.printf("The product is %d", prudctFromToX(n1, n2));
		else
			System.out.print("Logic error");
	}
	
	public static int prudctFromToX(int fromN, int toN) {
		int sum = 1;
		
		for (;fromN <= toN; ++fromN)
			if (fromN % 5 == 0)
				sum *= fromN;
		
		return sum;
	}
}
