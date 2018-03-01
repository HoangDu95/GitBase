package Bai29;

import java.util.Scanner;

public class ConvertBinary {

	public static void main(String[] args) {
		int n = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can chuyen");
		n = sc.nextInt();
		for(int a = n; a<n;a++) {
			i = n%2;
			n = n/2;
			System.out.println(""+i);
		}

	}

}
