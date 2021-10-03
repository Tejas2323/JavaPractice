package com.itvedant;

import java.util.Scanner;


public class First {

    {	System.out.println("Python");	} //Anonymous block (Always executed when an object is instantiated)

	public First() {
	System.out.println("Hii");
	}	
	static { System.out.println("java"); } //Static block always execute first before main method
	{ System.out.println("Django"); }	
	public static void main(String[] args) {	
		new First();
		new First();
		new First();
		new First();
		new First();
	}
}