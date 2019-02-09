/*
 * PraŠtevilo je naravno Število n > 1, če ima točno dva pozitivna delitelja (faktorja), 
 * Število 1 in samega sebe kot edini prafaktor. Pri tem je 1 edini pravi delitelj tega Števila. 
 * Po definiciji Število 1 ni praŠtevilo. Število 2 je praŠtevilo.
 * Množica prvih 25 pozitivnih praŠtevil: 
 * { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 }.
 * Uporabnik vpiŠe Število, program izpiŠe ali je vpisano Število praŠtevilo.
 */

package vaja5;

import java.util.Scanner;

public class vaja5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		char repeat;

		while (true) 
		{
			System.out.print("Input the number: ");
			n = input.nextInt();
			
			if (n % 2 != 0 && n % 3 != 0)
				System.out.println("To število je praštevilo");
			else
				System.out.println("To število je naravno");
			
			System.out.print("Do you wish to input another number (y/n)?: ");
			repeat = input.next().charAt(0);
			
			if (repeat == 'n')
				break;
			else
				continue;
		}
		
		input.close();

			
	}

}
