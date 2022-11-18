package tes;

//Write a java Program to remove all white spaces from string using replace()

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "	Halo nama saya Ahmad	";
		System.out.println("Before remove whitespace :" +a);
		System.out.println("After remove whitespace :" +a.replaceAll("\\s",""));
	}

}
