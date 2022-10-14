package com.java8;

public class LambdaExpression {

	public static void main(String[] args) {
		int speed=100;
		// without lambda expression
		/*Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running at the speed of" +speed);
				
			}
		}; 
		
		
			r.run();*/
		// new approach lambda expression to implement 
		Runnable r=()->
		{
			System.out.println("Running at the speed of" +speed);
			
		};
		r.run();
		}
	
	}

	
