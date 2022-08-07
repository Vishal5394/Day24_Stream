package com.Bridgelabz.Stream;

public class Contacts {
	  private String firstName;
	  private String lastName;
	  private String address;
	    private  String city;
	    private  String state;
	    private String email;
	    private long  phoneNum;
	    private int zipCode;


	  Contacts(String firstName, String lastName, String address, String city, String state, int zip, long phoneNum, String email){
	    this.firstName=firstName;
	    this.lastName=lastName;
	    this.address=address;
	    this.city=city;
	    this.state=state;
	    this.zipCode=zipCode;
	    this.phoneNum=phoneNum;
	    this.email=email;
	  }
	  public String getFirstName() {
		    return firstName;
		  }
		  public void setFirstName(String firstName) {
		    this.firstName = firstName;
		  }
}