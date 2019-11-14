package demo;
import java.util.*;

public class operations 
{
	public static int count =0;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		add(A,B,C);
		sub(A,B,C);
		div(A,B,C);
		mul(A,B,C);
		if (count ==0)
		{
			System.out.print("NOT POSSIBLE");
			System.out.println("789");
		}
		
		
		
	}
	public static void add(int A,int B,int C)
	{
		int answer = A+B;
		if(answer == C)
		{
			System.out.println("ADD");
			count++;
			
		}
	}
	public static void sub(int A,int B,int C)
	{
		int answer =A-B;
		if(answer == C)
		{
			System.out.println("SUB");
			count++;
		}
	}
	public static void mul(int A,int B,int C)
	{
		int answer = A*B;
		if (answer == C)
		{
			System.out.println("MUL");
			count++;
		}
	}
	public static void div(int A,int B,int C)
	{
		int answer = A/B;
		if (answer == C)
		{
			System.out.println("DIV");
			count++;
		}
	}

}
