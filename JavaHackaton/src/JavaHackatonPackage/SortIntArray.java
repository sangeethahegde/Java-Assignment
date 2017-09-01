package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n=reader.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=reader.nextInt();
			
		}
        reader.close();
		Arrays.sort(a);
		
		System.out.println("After sorting");
		for(int elm:a)
			System.out.println(elm);
		
	}

}
