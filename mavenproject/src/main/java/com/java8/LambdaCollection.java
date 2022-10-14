package com.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(01);
		list.add(13);
		list.add(27);
		list.add(28);
		list.add(24);
		//Traversing using For each
		System.out.println("Traversing Using Foreach");
		for(Integer element : list)
		{
			System.out.println(element);
		}
		//lambda expression
		System.out.println("Traversing Using lambda expression");
		list.forEach(element ->System.out.println(element));
		

	}

}
