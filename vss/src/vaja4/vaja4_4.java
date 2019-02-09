/*
 * Frekvenca pojavitev posameznih ocen Študentov
 * Uporabnik vnaŠa ocene Študentov dokler ne vnese 0.
 * Program določi in izpiŠe frekvence pojavitev posameznih ocen
 */

package vaja4;

import java.util.Scanner;

public class vaja4_4 {

	public static void main(String[] args) {
		int grade, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0;
		Scanner input = new Scanner (System.in);
		
		while (true) {
			System.out.print("Insert a grade (0 za konec): ");
			grade = input.nextInt();
			
			if (grade == 0)
				break;
			
			switch(grade) {
				case 6:
					++n6;
					break;
				case 7:
					++n7;
					break;
				case 8:
					++n8;
					break;
				case 9: 
					++n9;
					break;
				case 10:
					++n10;
					break;
				default:
					System.out.print("Napačno oceno ste vnesli");
			}
		}
		input.close();
		System.out.printf("Frekvenca ocen: \n"
				+ " 6: %d\n 7: %d\n 8: %d\n 9: %d\n 10: %d\n", n6, n7, n8, n9, n10);
	}

}
