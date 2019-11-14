package demo;

import java.util.Scanner;

public class problem2 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value1");
		int n1 = sc.nextInt();
		int answer;
		System.out.println("Enter the value2");
		int n2 = sc.nextInt();
		if (n1>6 || n2>6)
		{
			System.out.print("Enter the valid input");
		}
		else
		{
			int sum = n1+n2;
			if (sum<8)
			{
				 answer = 8-sum;
				 System.out.print(answer);
			}
			else
			{
				answer =Math.abs (2*(8-sum));
				System.out.print(answer);
			}
		}
	}
}

