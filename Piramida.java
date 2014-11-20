package lab9;

import java.util.Scanner;

public class Piramida {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		for (int i=1; i<=broj; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		unos.close();

	}

}
