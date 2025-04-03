package Collection;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		int first = 0, second = 1, next;
		System.out.print("Fibonacci series: ");
		for(int i = 0;i<=number;i++) {
			System.out.print(first + " ");
			next = first + second;
			first = second;
			second = next;
		}
	}

}
