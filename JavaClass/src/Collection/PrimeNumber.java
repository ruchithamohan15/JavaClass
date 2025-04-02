package Collection;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int Number = scanner.nextInt();
		
		if (isprime(Number)) {
			System.out.print("Prime Number");
		}
		else {
			System.out.print("Not Prime Number");
		}
	}
	public static boolean isprime(int number) {
		if(number < 2) return false;
		if(number ==2) return true;
		if(number %2 == 0) return false;
		for(int i=3; i * i <= number; i+=2){
			if(number%i==0)
			return false;
		}
		return true;
		
	}

}
