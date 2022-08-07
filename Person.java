package com.Bridgelabz.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Person implements AddressBookIF  {
    static Scanner sc = new Scanner(System.in);
    static String firstName,lastName,address,state,email,city;
    static int zip;
    static long phoneNumber;
    ContactInfo infoContact = new ContactInfo();
    Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
    static Map<String,Contacts> detailsBook = new HashMap<>();
  

    public void createContact() {
        System.out.println("Enter how many contacts you want to create");
        int numOfContact = sc.nextInt();
        while(numOfContact > 0) {
            System.out.println("Enter Name of the person");
            String firstName = sc.next();
            if(!detailsBook.containsKey(firstName)) {
                infoContact.info();
                detailsBook.put(firstName,new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email));
                numOfContact--;
            }
            else {
                System.out.println("Contact already exists!");
            }
        }
    }
  
    public void display() {
        System.out.println("Created contact list is");
        for(Entry m : detailsBook.entrySet()) {
            System.out.println(m.getKey()+"--> "+m.getValue());
        }
    }
}
