package basicProgram;

import java.util.Scanner;

//if we use this 1. 10 2. -10 it will print negative values

public class EvenOdd_NegativePositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		if (s < e) {
			for (int i = s; i <= e; i++) {
				if (i % 2 == 0) {
					System.out.println("Even Number " + i);
				} else {
					System.out.println("Odd Number " + i);
				}
			}
		} else if (s > e) {
			for (int i = s; i >= e; i--) {
				if (i % 2 == 0) {
					System.out.println("Even Number " + i);
				} else {
					System.out.println("Odd Number " + i);
				}
			}
		}
	}

}
