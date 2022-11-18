package tes;

//write a java program to swap two number without using the third variable

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 400;
		int a2 = 20;
		
		System.out.println("Number 1 before swapping : "+a1);
		System.out.println("Number 2 before swapping : "+a2);
		System.out.println();
		
		a1 = a1 + a2;
		a2 = a1 - a2;
		a1 = a1 - a2;
		System.out.println("Number 1 after swapping : "+a1);		
		System.out.println("Number 2 after swapping : "+a2);
	}

}
