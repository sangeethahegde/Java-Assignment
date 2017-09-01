package JavaHackatonPackage;

import java.util.Scanner;

public class FactRec {
	private static int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return (n*fact(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=reader.nextInt();
		reader.close();
		int factno=fact(n);
		System.out.println("Factorial of number:"+factno);

	}

}
