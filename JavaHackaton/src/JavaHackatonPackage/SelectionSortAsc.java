package JavaHackatonPackage;

import java.util.Scanner;

public class SelectionSortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter size");
		int n=reader.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		
		System.out.println("Ascending order sort");
		for(int elm:a)
			System.out.println(elm);

	}

}
