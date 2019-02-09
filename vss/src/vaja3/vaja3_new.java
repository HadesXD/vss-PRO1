package vaja3;

import java.util.Scanner;

public class vaja3_new {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert value: ");
		int n = input.nextInt();
		int length = String.valueOf(n).length();
		input.close();
		
		while (length != 0)
		{
			System.out.println(n % 10);
			n /= 10;
			--length;
		}
	}
}

