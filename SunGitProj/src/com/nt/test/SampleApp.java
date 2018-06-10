package com.nt.test;

public class SampleApp {
 
	public static int sub(int x,int y){
		return x-y;
	}
	public static void main(String[] args) {
		System.out.println("Hello");

		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}
		 System.out.println("add==="+SampleApp.sub(100,200));
		 
		 new ListCountries().displayCountries();

		 WishGenerator generator=new WishGenerator();
		    System.out.println("Msg:::"+generator.generateWishMessage("Raja"));
	}
	 
}
// hi
// Hello