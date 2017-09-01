package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class MyBinarySearch {
	public static int binarySearchIm(int[] a,int elm)
	{
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(elm==a[mid])
				return mid;
			else if(elm<a[mid])
				h=mid-1;
			else
				l=mid+1;
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=reader.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			a[i]=reader.nextInt();
		
		Arrays.sort(a);
		
		System.out.println("Enter element to be searched");
		int elm=reader.nextInt();
		reader.close();
		
		int index=binarySearchIm(a,elm);
		if(index>=0)
			System.out.println(elm+" found ");
		else
			System.out.println("Element not found");
		

	}

}
