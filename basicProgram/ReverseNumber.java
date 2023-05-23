package basicProgram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = sc.nextInt();
		int ans = 0;
		while (n != 0) {
			int b = n % 10;
			ans = ans * 10 + b;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
