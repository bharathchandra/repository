package demo;

import java.util.*;
public class checkisidentifier
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char firstletter = s.charAt(0);
	int n = (int)firstletter;
	int count1 =0,count2=0;
	if (n>=97 && n<=122)
	{
	   
	}
	else
	{
	  count1++;
	}
	for (int i =0;i<s.length();i++)
	{
	   if ((int)s.charAt(i)>=32 && (int)s.charAt(i)<=47 )
	   {
	       count2++;
	   }
	 
	}
	if(count1 == 0 && count2==0)
	{
	   System.out.println("No Error");
	}
	if (count1>0 && count2>0)
	{
	   System.out.println("Error1");
	   System.out.println("Error2");
	   System.exit(0);
	}
	if(count1>0)
	   {
	 System.out.println("Error1");
	}
	if(count2>0)
	{
	   System.out.println("Error2");
	}
	
	}
}
