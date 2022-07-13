package Logical_Programming;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value ");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println(" Given Number is even");
		}
		else
		{
			System.out.println("Given number is Odd");
		}
		

	}

}
