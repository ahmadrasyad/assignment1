package tes;

import java.util.Arrays;

//Write a Java Program to find the second-highest number in array.

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {4,5,3,7,2,8,9,12,5};
		
		Arrays.sort(a);
		
		for(int aa : a) {
			System.out.println(aa);
		}
		System.out.println();
		
		System.out.println("Second Largest : "+a[7]);
		System.out.println("Second Smallest : "+a[1]);
		
	}

}
