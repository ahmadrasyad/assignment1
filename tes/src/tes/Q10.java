package tes;

//Write a java program to reverse a string without using String inbuilt function reverse

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  String s= "banana"; 
	  String nstr=""; 
      char c; 
        
      System.out.println("Original word :"+s);
        
      for (int i=0; i<s.length(); i++) 
      { 
        c= s.charAt(i);  
        nstr= c+nstr;  
      } 
      System.out.println("Reversed word: "+ nstr); 
    } 
		

}
