/*
 * Izračun obresti
 * Uporabnik vnese začetno stanje glavnice, obrestno mero (letno) in Število let.
 * Program po letih izpiŠe leto in stanje v tistem letu.
 * Novo stanje za tekoče leto = začetno stanje * Math.pow(1.0 + obrestna mera, leto)
 */

package vaja4;

import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class vaja4_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int date = Calendar.getInstance().get(Calendar.YEAR);
		
		int stLet;
		double glav, lObr, newL;
		
		System.out.print("Vnesi stanje glavnice: ");
		glav = input.nextFloat();
		System.out.print("Vnesi obrestno mero: ");
		lObr = input.nextFloat();
		System.out.print("Vnesi število let: ");
		stLet = input.nextInt();
		input.close();
		
		while (0 < stLet)
		{
			date += 1;
			newL = (float) (glav * Math.pow(1.0 + lObr, stLet));
			System.out.printf("The current year is %d and the value is %.3f.\n", date, newL);
			--stLet;
		}
	}
}
