package basicProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		for (int a = s; a <= e; a++) {
			int temp = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					temp = 1;
				}
			}
			if (temp == 0) {
				System.out.println("Even Number" + a);
			}
		}
	}
}
