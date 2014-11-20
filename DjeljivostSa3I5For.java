package lab9;

import java.util.Scanner;

public class DjeljivostSa3I5For {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		double broj = unos.nextInt();
		int sa3=0;
		int sa5=0;
		for (int i=1; i<=broj; i++)
		{
			if (i%3==0)
			{
				sa3++;
			}
			if (i%5==0)
			{
				sa5++;
			}
		}
		System.out.println("Brojevi djeljivi sa 3: " + sa3);
		System.out.println("Brojevi djeljivi sa 5: " + sa5);
		unos.close();

	}

}
