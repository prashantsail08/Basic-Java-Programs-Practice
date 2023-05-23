package basicProgram;

import java.util.Scanner;

public class EvenNumber {
	
	void even(int a)
	{
		for(int i=1; i<=a; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number "+i);
			}
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = sc.nextInt();
	EvenNumber obj = new EvenNumber();
	obj.even(n);
}
}
