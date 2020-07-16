package demo;

import java.util.Scanner;

public class ArraySortElement 
{
	public static void main(String[] args) 
	{
		int n, temp;
		
		Scanner s = new Scanner(System.in);

		
		System.out.print("Enter the elements you want : ");
		n = s.nextInt();

		
		int a[] = new int[n];

	
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}

		
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] > a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	 		
		System.out.println("Ascending Order:");
		for (int i = 0; i < n ; i++) 
		{
			System.out.println(a[i]);
		}
	}   
}