package JavaHackatonPackage;

import java.util.Scanner;

public class ToalIntUcLcInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=reader.nextLine();
		
		char[] cstr=str.toCharArray();
		int dc=0,lc=0,uc=0;
		for(int i=0;i<cstr.length;i++)
		{
			if(Character.isUpperCase(cstr[i]))
				uc++;
			else if(Character.isLowerCase(cstr[i]))
				lc++;
			else if(Character.isDigit(cstr[i]))
				dc++;
				
		}
		System.out.println("Total of of Uppercase Letters "+uc);
		System.out.println("Total of of Lowercase Letters: "+lc);
		System.out.println("Total of of Digits: "+dc);
		

	}

}
