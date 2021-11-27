package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

    /**
     * used to add contacts to addressbook
     * */

    public void addContact() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name");
            String firstName = sc.next();
            System.out.println("Last name");
            String lastName = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter city ");
            String city = sc.next();
            System.out.println("Enter state ");
            String state = sc.next();
            System.out.println("Enter EmailId ");
            String emailId = sc.next();
            System.out.println("Enter zip ");
            int zipCode = sc.nextInt();
            System.out.println("Enter phone number ");
            long phoneNumber = sc.nextInt();
            System.out.println("Contact number  saved");
            System.out.println("==================================");
            Contacts details = new Contacts(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
    }
}
