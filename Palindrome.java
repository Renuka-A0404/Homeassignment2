package assignment2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num,a,b,rem;
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter any number");
		     num=sc.nextInt();
		 a=num;
		 for(b=0;num>0;num/=10) {
			 rem=num%10;
			 b=(b*10)+rem;
		 }
         if(b==a)
        	 System.out.println(a+" is a palidrome number");
         else
        	 System.out.println(a+ "is not a palidrome number");
	}

}
