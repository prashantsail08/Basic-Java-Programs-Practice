package basicProgram;

import java.util.Scanner;

public class Arm_ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int num = n;
		int rem = 0;
		int ans = 0;
		while (n != 0) {
			rem = n % 10;
			ans = ans + (rem * rem * rem);
			n = n / 10;
		}
		System.out.println(ans);
		if (ans==num) {
			System.out.println("its Arm Number");
		} else {
			System.out.println("Its Not Arm Number");
		}
	}
}
