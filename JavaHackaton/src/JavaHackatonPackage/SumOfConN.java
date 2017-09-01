package JavaHackatonPackage;

import java.util.Scanner;

public class SumOfConN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=reader.nextInt();
		int sum=0;
		int j;
		
		for(int i=1;i<n;i++)
		{
			sum=i;
			j=i+1;
			
			while(sum<n)
			{
				sum=sum+j;
				j++;
			}
			
			if(sum==n)
			{
				for(int k=i;k<j;k++)
				{
					if(k==i)
						System.out.print(k);
					else
						System.out.print(" + "+k);
				}
				System.out.println("");
			}
			
		}

	}


	}

