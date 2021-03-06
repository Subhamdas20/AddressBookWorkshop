package com.bridgelabz.addressbook;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBook {
    static ArrayList<Contacts> contact_Details = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    /**
     * used to add contacts to addressbook
     */
    public static void addContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to save");
        int numberOfContacts = sc.nextInt();
        for (int i = 0; i < numberOfContacts; i++) {
            Contacts details = new Contacts();
            System.out.println("Enter the details of contact number " + (i + 1));
            System.out.println("Enter  first name");
            String firstName = sc.next();
            details.setFirstName(firstName);
            System.out.println("Last name");
            String lastName = sc.next();
            details.setLastName(lastName);
            System.out.println("Enter address");
            String address = sc.next();
            details.setAddress(address);
            System.out.println("Enter city ");
            String city = sc.next();
            details.setCity(city);
            System.out.println("Enter state ");
            String state = sc.next();
            details.setState(state);
            System.out.println("Enter EmailId ");
            String emailId = sc.next();
            details.setEmailId(emailId);
            System.out.println("Enter zip ");
            int zipCode = sc.nextInt();
            details.setZipCode(zipCode);
            System.out.println("Enter phone number ");
            int phoneNumber = sc.nextInt();
            details.setPhoneNumber(phoneNumber);
            System.out.println("Contact number " + (i + 1) + " saved");
            System.out.println("==================================");
            contact_Details.add(details);
        }
    }

    /**
     * used to edit contacts
     *
     * @param name is used to edit contacts
     */
    public void editContacts(String name) {
        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts");
                System.out.println("Enter the updated first name");
                String firstName = sc.next();
                contact.setFirstName(firstName);
                System.out.println("Enter the updated last name");
                String lastName = sc.next();
                contact.setLastName(lastName);
                System.out.println("Enter the updated address");
                String address = sc.next();
                contact.setAddress(address);
                System.out.println("Enter the updated city");
                String city = sc.next();
                contact.setCity(city);
                System.out.println("Enter the updated state");
                String state = sc.next();
                contact.setState(state);
                System.out.println("Enter the updated emailID");
                String emailId = sc.next();
                contact.setEmailId(emailId);
                System.out.println("Enter the updated zipcode");
                int zipcode = sc.nextInt();
                contact.setZipCode(zipcode);
                System.out.println("Enter the updated phoneNumber");
                long phoneNumber = sc.nextInt();
                contact.setPhoneNumber(phoneNumber);
            }
        }
    }

    /**
     * deleteContact is used to delete
     *
     * @param name is used to delete the contact based upon names
     */
    public void deleteContact(String name) {
        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts, deleting contact");
                contact_Details.remove(contact);
            } else
                System.out.println("Entered name not found in the AddressBook");
        }
    }
    /**
     * showContacts is used to display contacts
     */
    public void showContacts() {
        int i = 1;
        for (Contacts contact : contact_Details) {
            System.out.println("Details  of contact number " + i + " is");
            System.out.println(contact.toString());
            i++;
        }
    }
}
