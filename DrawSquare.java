package lab9;

import java.util.Scanner;

public class DrawSquare {
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter first side of square: ");
		int num1 = unos.nextInt();
		System.out.println("Enter second side of square: ");
		int num2 = unos.nextInt();
		for (int i=0; i<num1; i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for (int i=0; i<num2; i++)
		{
			System.out.print("*");
			for (int j=2; j<num1; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
		for (int i=0; i<num1; i++)
		{
			System.out.print("*");
		}
	}

}
