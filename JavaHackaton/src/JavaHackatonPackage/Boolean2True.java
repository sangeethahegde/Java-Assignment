package JavaHackatonPackage;

import java.util.Scanner;

public class Boolean2True {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Scanner reader=new Scanner(System.in);
			
			boolean a,b,c;
			
			System.out.println("Enter 3 boolean values");
			a=reader.nextBoolean();
			b=reader.nextBoolean();
			c=reader.nextBoolean();
			reader.close();
			if(a==b && a==true)
				System.out.println("True");
			else if(b==c && b==true)
				System.out.println("True");
			else if(a==c && c==true)
				System.out.println("True");
			else
				System.out.println("False");
			

		}

	}


