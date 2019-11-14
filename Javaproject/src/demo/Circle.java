
package demo;
import java.util.*;
public class Circle 
{
     public static void main(String[]args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the value1");
    	 int n1 = sc.nextInt();
    	 System.out.println("Enter the value2");
    	 int n2 = sc.nextInt();
    	 if (n1==n2)
    	 {
    		 int number = (2*(n1+n2));
    		 System.out.print(number);
    	 }
    	 else if (n1> 6 || n2> 6)
    	 {
    		 System.out.print("Enter valid input");
    	 }
    	 else
    	 {
    		 int sum =n1+n2;
    		 System.out.println(sum);
    	 }
    	 
    	 
     }
}
