package com.bridgelabz.adressbook;

import java.util.Scanner;

public class Contacts {
	static Scanner scan = new Scanner(System.in);
    public void addContact(){
        Contacts contacts = new Contacts();
        System.out.println("FirstName: ");
        String firstName = scan.next();
        contacts.setFirstName(firstName);
        System.out.println("LastName: ");
        String lastName = scan.next();
        contacts.setFirstName(lastName);
        System.out.println("Address: ");
        String address = scan.next();
        contacts.setAddress(address);
        System.out.println("City: ");
        String city = scan.next();
        contacts.setState(city);
        System.out.println("State: ");
        String state = scan.next();
        contacts.setState(state);
        System.out.println("Zip: ");
        String zip = scan.next();
        contacts.setState(zip);
        System.out.println("phone: ");
        String phone = scan.next();
        contacts.setState(phone);
        System.out.println("Email: ");
        String email = scan.next();
        contacts.setState(email);

        System.out.println(contacts.toString());

    }
	void setState(String city) {
		// TODO Auto-generated method stub
		
	}
	private void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}
	void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}
}

