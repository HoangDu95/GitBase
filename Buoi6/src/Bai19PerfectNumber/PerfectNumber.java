package Bai19PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number: ");
		int iNum = sc.nextInt();
		int iSum = 0;
		for(int i = 1; i<= iNum/2; i++) {
			if(iNum %i == 0) {
				System.out.println(""+i);
				iSum = iSum + i;
			}
		}
		System.out.println("Sum = "+iSum);
		if(iSum == iNum)
			System.out.println("The number is perfect");
		else
			System.out.println("The number is not perfect");
	}
}
