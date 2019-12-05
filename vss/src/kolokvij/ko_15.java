package kolokvij1;

/*
 * Vaja 15
 * 
 * Napišite metodo, ki izpiše 16 nakljuènih števil iz intervala odStevila do doStevila (slika).
 * public static void izpis16NakljucnaInterval (int odStevila, int doStevila) 
 * Npr. klic  izpis16NakljucnaInterval (10,100) izpiše:
 */

import java.util.Scanner;
import java.util.Random;

public class ko_15 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("From: ");
		int n1 = input.nextInt();
		System.out.print("To: ");
		int n2 = input.nextInt();
		input.close();
		
		if (n2 > n1)
			output16Randoms(n1, n2);
		else 
			System.out.print("Logic error!");
	}
	
	public static void output16Randoms(int n1, int n2) {
		Random rand = new Random();
		int maxOutput = 16;
		int randomNumber;
		
		for (int i = 0; i < maxOutput; ++i) {
			randomNumber = rand.nextInt(n2) + n1;
			System.out.println(randomNumber);
		}
	}
}
