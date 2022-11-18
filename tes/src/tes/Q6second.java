package tes;

//write a java program whether a string or number is palindrome or not



public class Q6second {

	public static boolean palindrome(String s) {
		//String
		String rev ="";
		
		boolean ans = false;
		
		
		
		for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (s.equals(rev)) {
            ans = true;
        }
        return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number
		int a = 0;
		int sum = 0;
		int temp;
		
		int n =454;
		
		temp=n;
		while(n>0) {
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}
		
		if(temp == sum) {
			System.out.println("palindrome number");
		}
		else
		System.out.println("not palindrome number");
		System.out.println();
	
		
		//String
		  String s = "abba";
		  
	    
	      boolean A = palindrome(s);
	      if(A == true) {
	    	  System.out.println("String is palindrome");
	      }else
	    	  System.out.println("String is not palindrome");
	
	}
	
	

}
