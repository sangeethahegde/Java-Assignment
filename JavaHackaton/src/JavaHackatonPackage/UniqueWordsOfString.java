package JavaHackatonPackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=reader.nextLine();
		String[] strarr=str.split(" ");
		
		Arrays.sort(strarr);
		
		boolean unique;
		System.out.println("Unique words in a strings are:");
		for(int i=0;i<strarr.length;i++)
		{
			unique=true;
			while((i+1)<strarr.length && strarr[i].equals(strarr[i+1]))
			{
				unique=false;
				i++;
			}
			if(unique==true)
				System.out.println(strarr[i]);
		}

	}

}
