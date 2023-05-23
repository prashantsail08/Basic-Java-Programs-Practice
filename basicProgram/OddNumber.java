package basicProgram;

import java.util.Scanner;

public class OddNumber {
	
	void odd(int a)
	{
		for(int i=1; i<=a; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Number"+i);
			}
		}
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n =sc.nextInt();
	OddNumber obj = new OddNumber();
	obj.odd(n);
}
}
