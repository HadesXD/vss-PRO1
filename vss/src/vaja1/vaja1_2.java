/*
 * Vaja1_2
 * 
 * Program na zaslon izpiše obvestilo.
 * Ime: <Vaše ime npr. Marko>
 * Priimek: <Vaš priimek npr. Koren>
 * E-naslov: <Vaš elektronski naslov>
 */

package vaja1;

import java.util.Scanner;

public class vaja1_2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sName, sSurname, sEmail;
		
		System.out.print("Insert name: ");
		sName = input.next();
		
		System.out.print("Insert surname: ");
		sSurname = input.next();
		
		System.out.print("Insert email: ");
		sEmail = input.next();
		input.close();
		
		System.out.printf("Welcome %s %s, your email is %s.", sName, sSurname, sEmail);
	}
}
