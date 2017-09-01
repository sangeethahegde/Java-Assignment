package JavaHackatonPackage;

import java.util.Scanner;

public class InputIsStrIntBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter input");
		String str=reader.nextLine();
    
        int flag=0;
		try{
			int a=Integer.parseInt(str);
			System.out.println("Is integer");
			flag=1;
		}catch(Exception e){}
		
		if(str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false"))
		{
			System.out.println("Is boolean");
			Boolean.parseBoolean(str);
			flag=1;
		}
		if(flag==0)
			System.out.println("Is String");
     }

}
