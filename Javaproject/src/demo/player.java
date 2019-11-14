package demo;

import java.util.Scanner;

public class player {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value1");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		double answer;
		int fourruns = Y*4;
		int sixruns  = Z*6;
		int runsbyboundaries = fourruns +sixruns ;
		answer = X-runsbyboundaries;
		double finale =(answer/X)*100;
		System.out.format("%.2f", finale);
		
	}

}
