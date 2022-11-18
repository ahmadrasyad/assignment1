package tes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q17 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		
		System.out.println("Enter the word to be found");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		boolean flag = false;
		int count = 0;
		System.out.println("Contents of the line");
		
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\Dell 7250\\Desktop\\String.txt"));
		while(sc2.hasNextLine()) {
			String line = sc2.nextLine();
			System.out.println(line);
			if(line.indexOf(word)!=-1) {
				flag = true;
				count = count +1;
			}
		}
		if(flag) {
	         System.out.println("File contains the specified word");
	         System.out.println("Number of occurrences is: "+count);
	      } else {
	         System.out.println("File does not contain the specified word");
	      }
	}

}
