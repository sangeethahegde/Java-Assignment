package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfOccuOfAllChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a string");
		String s= reader.nextLine();
		reader.close();
		char ch[]=s.toCharArray();
		
		
		Arrays.sort(ch);
		
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			while((i+1)<s.length() && ch[i]==ch[i+1])
			{
				count++;
				i++;
			}
			if(count>0)
				System.out.println(ch[i]+" occured "+count+" times");
			count=1;
		}
	}

	}

