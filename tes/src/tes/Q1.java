package tes;

//Write a Java Program to remove all white spaces from a string without using replace()

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Halo nama saya Ahmad";
		String [] s = a.split(" ");
		String s2 = "";
		for(String aa : s) {
			 s2 = s2+aa;
		}
		
		System.out.println("Before remove whitespace : " +a);
		System.out.println("After remove whitespace : " +s2);
		
	}

}
