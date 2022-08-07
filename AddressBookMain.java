package com.Bridgelabz.Stream;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to AdderssBook Program.");
		
		 AddressBookIF person1 = new Person();
	        person1.createContact();
	        person1.display();
	}
}