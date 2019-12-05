package kolokvij1;

/*
 * Vaja 13
 * 
 * Napišite metodo, ki vrne vrne najveèji skupni delitelj dveh celih števil (stevilo1, stevilo2).
 * public static long najvecjiSkupnidelitelj(long stevilo1, long stevilo1) 
 * Npr. klic  najvecjiSkupnidelitelj (20,8) vrne 4.
 */

import java.util.Scanner;

public class ko_13 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("N1: ");
		int n1 = input.nextInt();
		System.out.print("N2: ");
		int n2 = input.nextInt();
		input.close();
		
		System.out.printf("The largest division: %d.", biggestDevider(n1, n2));
	}
	
	public static long biggestDevider(int n1, int n2) {
		int largest = 0;
		int half = 0;
		
		if (n1 > n2)
			half = n1 / 2;
		else
			half = n2 / 2;
		
		for (int i = 1; i <= half; ++i)
			if (n1 % i == 0 && n2 % i == 0)
				if (largest < i)
					largest = i;
		
		return largest;
	}
}
