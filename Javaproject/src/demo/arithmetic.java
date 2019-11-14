package demo;

import java.util.Scanner;

public class arithmetic 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		 n = sc.nextInt();
		int a[][]= new int[n][n] ;
		int count =0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int []array = new int[a.length];
		
		for (int i=0;i<a.length;i++)
		{
			int element = a[0][i];
			for (int j=0;j<a.length;j++)
			{
				if (a[i][j]== element)
				{
					count++;
				}
			}
			if (count >= n)
			{
				break;
			}
		}
		
		if (count>=n)
		{
			System.out.print(count);
		}
		else
		{
			System.out.print("-1");
		}
		
	}

}
                                                                                