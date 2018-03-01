package Bai9OddSum;

import java.util.Scanner;

public class TongSoLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of terms:");
		int iTerms = sc.nextInt();
		int iSum = 0, iOdd = 1;
		System.out.println("The odd numbers are: ");
		for (int i = 1; i <= iTerms; i++) {
			iSum = iSum + iOdd;
			System.out.println("+" +iOdd);
			iOdd = iOdd + 2;
		}
		System.out.println("The Sum of odd Natural Number upto 10 terms: " + iSum);
	}

}
