package Collection;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int Number = scanner.nextInt();
		int Factorial = 1;
		for (int i = 1; i <= Number;i++) {
			Factorial = Factorial * i;
		}
		System.out.print("Factorial nuber is : " + Factorial);
	}

}
