package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Maximumproduct 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,answer=0;
		int []array = new int [n];
		for (int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		Arrays.sort(array);
		int maxelement = array[n-1];
		for (int i =0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				sum = array[i]*array[j];
				System.out.println("sum"+sum);
				if (sum<=maxelement)
				{
					answer = elementFound(sum,array);
				}
			}
			
			
				
			
			
		}
		System.out.print(answer);
	}
	public static int  elementFound(int sum ,int[] array)
	{
		for (int i =0;i<array.length;i++)
		{
			if (sum == array[i])
			{
				return sum;
			}
			else
			{
				return -1;
			}
		}
	}

}
