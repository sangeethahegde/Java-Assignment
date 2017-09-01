package JavaHackatonPackage;

import java.util.Scanner;

public class RemoveChar {

	public static void removechar(String str,char c)
	{
		String ch=String.valueOf(c);
		String remchar=str.replaceAll(ch,"");
		System.out.println("After removing"+ch+": "+remchar);
	    		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter string");
		String str=reader.nextLine();
		System.out.println("Enter char to be removed");
		char c=reader.next().charAt(0);
		removechar(str,c);
		

	}

}
