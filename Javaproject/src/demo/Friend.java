package demo;

import java.util.*;
public class Friend
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Float deposit= sc.nextFloat();
		int rate = sc.nextInt();
		int threshold = sc.nextInt();
		int years=0;
	while(deposit<threshold)
	{
	   deposit = deposit+(deposit*rate)/100;
	   years++;
	}
	System.out.print(years);
	}
}