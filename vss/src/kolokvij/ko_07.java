package kolokvij1;

/*
 * Vaja 7
 * 
 * Napišite metodo, ki glede na kriterij ocenjevanja in doseženo število toèk vrne ustrezno oceno.
 * public static String ocenaIzpita (int tocke)  
 * npr. klic  ocenaIzpita (80) vrne vrednost »pdb (9)«. 
 */

import java.util.Scanner;

public class ko_07 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input your points: ");
		int points = input.nextInt();
		input.close();
		
		System.out.printf("Your grade is %s.", gradeSystem(points));
	}
	
	public static String gradeSystem(int points) {
		String sValue = "";
		
		switch(points / 10) {
			case 1: case 2: case 3: case 4:
				sValue = "nzd(5)";
				break;
			case 5:
				sValue = "zd(6)";
				break;
			case 6:
				sValue = "db(7)";
				break;
			case 7:
				sValue = "pdb(8)";
				break;
			case 8:
				sValue = "pdb(9)";
				break;
			case 9: case 10:
				sValue = "odl(10)";
				break;
			default:
				sValue = "n/a";
				System.out.println("Logic error.");
		}
		return sValue;
	}
}
