package lab9;

import java.util.Scanner;

public class Piramida2 {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		int broj = unos.nextInt();
		for (int i=1; i<=broj; i++)
		{
			for (int j=1; j<=broj-i; j++)
			{
				System.out.printf("  ");
			}
		
			for (int k=1; k<=i; k++)
			{
				System.out.printf("%d ", k);
			}
			System.out.println("");
		}
	}

}
