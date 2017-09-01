package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedIntUcLc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a string");
		String s= reader.nextLine();
		reader.close();
		char ch[]=s.toCharArray();
		
		
		Arrays.sort(ch);
		
		int uc,lc,dc;
		
		for(int i=0;i<s.length();i++)
		{
			uc=1;lc=1;dc=1;
			while((i+1)<s.length() && ch[i]==ch[i+1] && Character.isUpperCase(ch[i]))
			{
				uc++;
				i++;
			}
			while((i+1)<s.length() && ch[i]==ch[i+1] && Character.isLowerCase(ch[i]))
					{
						lc++;
						i++;
					}
			while((i+1)<s.length() && ch[i]==ch[i+1] && Character.isDigit(ch[i]))
					{
						dc++;
						i++;
					}
			if(uc>1)
				System.out.println(ch[i]+" occured "+uc+" times");
			if(lc>1)
				System.out.println(ch[i]+" occured "+lc+" times");
			if(dc>1)
				System.out.println(ch[i]+" occured "+dc+" times");
		
		}
	}

	}


