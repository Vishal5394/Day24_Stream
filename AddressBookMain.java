package com.Bridgelabz.Stream;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to AdderssBook Program.");
		
		 AddressBookIF person1 = new Person();
	        person1.createContact();
	        person1.display();
	        person1.addContact();
	        person1.editContact();
	        person1.deleteContact();
	        person1.addToBook();
	        person1.operation();
	        person1.searchPerson();
	        person1.displayBook();
	}
}