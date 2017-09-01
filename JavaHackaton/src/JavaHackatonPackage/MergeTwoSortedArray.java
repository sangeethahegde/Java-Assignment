package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void merge(int[] a,int[] b,int m)
	{
		int alastindex=m-1;
		int blastindex=b.length-1;
		
		while(alastindex>=0 && blastindex>=0)
		{
			if(a[alastindex]>b[blastindex])
			{
				a[alastindex+blastindex+1]=a[alastindex];
				alastindex--;
			}
			else
			{
				a[alastindex+blastindex+1]=b[blastindex];
				blastindex--;
			}
		}
		while(blastindex>=0)
		{
			a[blastindex]=b[blastindex];
			blastindex--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a size of first array");
		int m=reader.nextInt();
		System.out.println("Enter a size of second array");
		int n=reader.nextInt();
		
		int[] a=new int[m+n];
		System.out.println("Enter elements in sorted order");
		for(int i=0;i<m;i++)
			a[i]=reader.nextInt();
		//Arrays.sort(a);
		
		
		int[] b=new int[n];
		System.out.println("Enter elements in sorted order");
		for(int i=0;i<n;i++)
			b[i]=reader.nextInt();
		//Arrays.sort(b);

		merge(a,b,m);
		System.out.println("After merging");
		for(int elm:a)
			System.out.print(elm+" ");
	}
		

}
