package JavaHackatonPackage;

import java.util.Scanner;

public class RevWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=reader.nextLine();
		String[] strarr=str.split(" ");
		for(int i=strarr.length-1;i>=0;i--)
			System.out.print(strarr[i]+" ");

	}

}
