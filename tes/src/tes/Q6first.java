package tes;

//write a java program for the fibonacci series
//example : 0,1,1,2,3,5,8,13,21.....

public class Q6first {

	static void fibonacci(int n) {
		int no1 = 0;
		int no2 = 1;
		
		int count = 0;
		
		while(count<n) {
			System.out.println(no1+" ");
			
			int no3 = no2+no1;
			no1 = no2;
			no2 = no3;
			count = count +1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		fibonacci(n);
		
	}

}
