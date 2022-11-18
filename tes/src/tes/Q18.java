package tes;

//remove all occurrences of a given character from input string??
//hint: String str1 = "abcdABCDabcdABCD"
// remove character =>'a'

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "abcdABCDabcdABCD";
		String s2 = "";
		
		s2 = str1.replaceAll("[a]","");
		
		System.out.println("Remove A from string : " +s2);
		
		
	}

}
