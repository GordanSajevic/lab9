package lab9;

public class NumberList {

	public static void main(String[] args) {
		int end = 10;
		int counter = 0;
		int difference = 1;
		System.out.println("Ispis brojeva sa for petljom: ");
		for (counter=0; counter<=end; counter+=difference)
		{
			System.out.printf("%d ", counter);
		}
		System.out.println("");
		System.out.println("Ispis brojeva sa while petljom: ");
		counter=0;
		while (counter <= end)
		{
			System.out.printf("%d ", ++counter);
		}
		System.out.println("");
		System.out.println("Ispis brojeva sa do while petljom: ");
		counter=0;
		do
		{
			System.out.printf("%d ", ++counter);
		}while (counter <= end);

	}

}
