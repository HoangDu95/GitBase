import java.util.Scanner;

public class NhapSoFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai vong lap");
		int n = sc.nextInt();
		System.out.println("Nhap gia tri: 0.Chan 1.Le");
		int k = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			if(i%2 == k) {
				System.out.println("So chan = "+i);
			}else {
				System.out.println("so le = "+i);
			}
			
		}
				
	}
}
