package lab9;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter number (-1 for end): ");
		double number = unos.nextDouble();
		double suma=0;
		double counter=0;
		do
		{
			suma = suma + number;
			System.out.println("Enter number (-1 for end): ");
			number = unos.nextInt();
			counter++;
		}while (number!=-1);
		double average=suma/counter;
		System.out.println(average);
	}

}
