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
    public void addContact()  {
        System.out.println("Enter how many contacts you want to add");
        int numOfContacts = sc.nextInt();
        while(numOfContacts > 0) {
            System.out.println("Enter Name of person");
            String firstName = sc.next();
            if(detailsBook.containsKey(firstName)) {
                System.out.println("Contact already exists!");
                return;
            }
            else {
                infoContact.info();
                detailsBook.put(firstName,new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email));
                numOfContacts--;
            }
        }
    }
    public void editContact()  {
        System.out.println("Enter name of person whose contact you want to edit");
        String firstName = sc.next();
        if(detailsBook.containsKey(firstName)) {
            infoContact.info();
            detailsBook.put(firstName,new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email));
        }
        else {
            System.out.println("Contact is not present in book");
        }
    }
    public void deleteContact()  {
        System.out.println("Enter name of person whose contact you want to delete");
        String name = sc.next();
        if(detailsBook.containsKey(name)) {
            detailsBook.remove(name);
        }
        else {
            System.out.println("Contact is not present in book");
        }
    }
  
    public void display() {
        System.out.println("Created contact list is");
        for(Entry m : detailsBook.entrySet()) {
            System.out.println(m.getKey()+"--> "+m.getValue());
        }
    }
}
