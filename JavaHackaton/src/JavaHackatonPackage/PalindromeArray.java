package JavaHackatonPackage;

import java.util.Scanner;

public class PalindromeArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=reader.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		System.out.println("Palindrome numbers in arrays are");
		for(int i=0;i<a.length;i++)
		{
			int revn=0;
			int temp=a[i];
			 while(a[i]!=0){
				revn=revn*10+a[i]%10;
				a[i]=a[i]/10;
				}
			if(temp==revn)
				System.out.println(temp);
			
		}
	}

}
