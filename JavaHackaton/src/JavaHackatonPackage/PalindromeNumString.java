package JavaHackatonPackage;

import java.util.Scanner;

public class PalindromeNumString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string or number");
		s=reader.next();
		palindromeOrNot(s);
		

	}
	
	public static void palindromeOrNot(String str)
	{
		
		String reverse = new StringBuffer(str).reverse().toString();
		if(str.compareTo(reverse)==0)
		System.out.println("Palindrome");
		else
		System.out.println("Not palindrome");
		
		
	}


}
