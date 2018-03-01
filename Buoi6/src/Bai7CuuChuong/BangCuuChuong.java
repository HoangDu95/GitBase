package Bai7CuuChuong;

import java.util.Scanner;

public class BangCuuChuong {
	public static void main(String[] args) {
		int fla = 0;
		int n = 0;
		String yn = "";
		Scanner sc = new Scanner(System.in);
		while (fla == 0) {
			System.out.println("Nhap cot cuu chuong: ");
			n = sc.nextInt();
			sc.nextLine();
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " x " + i + " = " + (n * i));
			}
			//System.out.println("\n");
			System.out.println("Ban muon tiep tuc?(Y/N)");
			yn = sc.nextLine();
			if(!isExit(yn)) {
				fla = 1;
				break;
			}
		}
		System.out.println("Ban da thoat khoi chuong trinh!!!");
	}
	static boolean isExit(String yn) {
		return(yn.equals("N")||yn.equals("n"))?false:true;
				
	}
}
