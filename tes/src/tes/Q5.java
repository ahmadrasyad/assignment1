package tes;

//Write a java program to find the duplicate characters in string

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		String s = "Great Power";
		
		char string[] = s.toCharArray();
		System.out.println("Character that is duplicate : ");
		for(int i = 0; i<string.length;i++) {
			count = 1;
			for(int j = i+1;j<string.length;j++) {
				if(string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = '0';
				}
			}
			if(count>1&&string[i] != '0') {
				System.out.println(string[i]);
			}
		
		}
		
	}

}
