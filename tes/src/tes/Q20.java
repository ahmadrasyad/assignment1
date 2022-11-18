package tes;

// How to prove String is immutable programmatically

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JAVA";
		 
        String s2 = "JAVA";
 
        System.out.println(s1 == s2);         //true
 
        s1 = s1 + "J2EE";
 
        System.out.println(s1 == s2);    //false
	}

}
