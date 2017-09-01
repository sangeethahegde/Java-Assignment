package JavaHackatonPackage;

import java.util.Scanner;

public class FactorialN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int n= reader.nextInt();
		reader.close();
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial("+n+")="+fact);

	}

}
