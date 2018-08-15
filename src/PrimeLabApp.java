import java.util.Scanner;

public class PrimeLabApp {

	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		int nthPrime = 2;
		
		System.out.println("Let's locate some primes!!!\n");
		System.out.println("This application will find you any prime, "
				+ "in order, from first prime number on.\n");
		System.out.println("Which prime number are you looking for? ");
		int userInput = scnr.nextInt();
		
		//Call the method to get result
		System.out.println("The number " + userInput + " prime is " + getNthPrime(userInput) + ".");
	
		System.out.println("Do you want to find another prime number? (y/n): ");
		
	
	}

	public static int getNthPrime(int num) {
		int result = 0;
		if (num == 1) {
			result = 2;
		}else if (num == 2) {
			result = 3;
		}else if (num == 3) {
			result = num + 2;
		}else {
			result = 7;
		}
		return result;
	}
	
	public static boolean getPrime(int num) {
		boolean answer = true;
		for (int i = 2; i <= num; i++) {
			if (num == 2) {
				answer = true;
			}
			else {
				answer = false;
			}
		}
		return answer;
		
	}
	
}
//	numberOfPrimes = 0;
//	while (numberOfPrimes <= userInput) {
//		int num = 2
//		for (int i = 2 ; i<=  ; i++) {
//			if ( = %)
//		
//	}

