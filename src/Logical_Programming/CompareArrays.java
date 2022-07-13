package Logical_Programming;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {20,30,40};
		int c[]= {10,20,30};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,c));
System.out.println(Arrays.equals(a,c));
	}

}
