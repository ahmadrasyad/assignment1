package tes;

//Java program to check if a vowel present in string

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "SDFG";
		
		String s2 = "a" ;
		String s3 = "i";
		String s4 = "u" ;
		String s5 = "e";
		String s6 = "o" ;
		String s7 = "A" ;
		String s8 = "I";
		String s9 = "U" ;
		String s10 = "E";
		String s11 = "O" ;
		
		if(s.contains(s2)||
		   s.contains(s3)||
		   s.contains(s4)||
		   s.contains(s5)||
	       s.contains(s6)||
	       s.contains(s7)||
		   s.contains(s8)||
		   s.contains(s9)||
		   s.contains(s10)||
	       s.contains(s11)) {
			System.out.println("String has vowel");
		}
		else
		{
			System.out.println("String has no vowel");
		}
		
	}

}
