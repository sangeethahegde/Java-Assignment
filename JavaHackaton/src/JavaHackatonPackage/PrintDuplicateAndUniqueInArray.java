package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDuplicateAndUniqueInArray {


		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner reader=new Scanner(System.in);
			System.out.println("Enter a number");
			int n= reader.nextInt();
			int num[]=new int[n];
			
			
			
			System.out.println("Enter "+n+" numbers");
			for(int i=0;i<n;i++)
			{
				 num[i]= reader.nextInt();
				 
			}
			
			Arrays.sort(num);
			
			int count=1;
			System.out.println("Number of occurence and unique numbers in arrays are:");
			for(int i=0;i<num.length;i++)
			{
				while((i+1)<num.length && num[i]==num[i+1])
				{
					count++;
					i++;
				}
				if(count==1)
					System.out.println(num[i]+" is unique");
				if(count>1)
					System.out.println(num[i]+" occured "+count+" times");
				count=1;
			}

		}

	}


