package vaja6;

import java.util.Vector;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Vector<Integer> work = new Vector<Integer>(5);
		Scanner input = new Scanner(System.in);
		int st = 0;
		int i = 0;
		
		while (st < 5)
		{
			System.out.print("Input: ");
			i = input.nextInt();
			work.add(i);
			++st;
		}
		
		input.close();
				
		for (int y : work) {
			System.out.println(work.get(y-1));
		}
	}
}
