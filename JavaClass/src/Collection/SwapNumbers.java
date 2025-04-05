package Collection;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = scanner.nextInt();
		System.out.print("Enter the Number: ");
		int b = scanner.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping: " + a + " " + b);

	}

}
