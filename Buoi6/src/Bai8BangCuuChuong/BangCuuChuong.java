package Bai8BangCuuChuong;

import java.util.Scanner;

public class BangCuuChuong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input upto the table number starting from 1 :");
		int iNum = sc.nextInt();
		for (int i = 1; i <= iNum; i++) {
			System.out.println("1 * " + i + "= " + (1 * i));
		}

	}

}
