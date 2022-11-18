package tes;

//How to shuffle an array in Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
		    a.add(i);
		}
		Collections.shuffle(a);
		
		System.out.println(a);
		
	}

}
