package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<Contacts> contact_Details = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void setAddContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to save");
        int numberOfContacts = sc.nextInt();
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter the details of contact number " + (i + 1));
            System.out.println("Enter  first name");
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
            addContacts(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
            System.out.println("Contact saved");
            System.out.println("==================================");
        }
    }

    /**
     * used to add contacts to addressbook
     */
    public ArrayList<Contacts> addContacts(String firstName, String lastName, String address, String city, String state, String emailId, int zipCode, long phoneNumber) {

        if (contact_Details.isEmpty()) {
            Contacts details = new Contacts();
            details.setFirstName(firstName);
            details.setLastName(lastName);
            details.setAddress(address);
            details.setCity(city);
            details.setState(state);
            details.setEmailId(emailId);
            details.setZipCode(zipCode);
            details.setPhoneNumber(phoneNumber);
            contact_Details.add(details);
        }
        else {
            for (Contacts contact : contact_Details) {
                if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                    System.out.println("duplicate entry");
                    break;
                }
                else  if (!firstName.equalsIgnoreCase(contact.getFirstName()))  {
                    Contacts details = new Contacts();
                    details.setFirstName(firstName);
                    details.setLastName(lastName);
                    details.setAddress(address);
                    details.setCity(city);
                    details.setState(state);
                    details.setEmailId(emailId);
                    details.setZipCode(zipCode);
                    details.setPhoneNumber(phoneNumber);
                    contact_Details.add(details);
                    break;
                }
            }
        }
        return contact_Details;
    }

    public void edit(String searchName) {
        System.out.println("Enter the updated first name");
        String firstName = sc.next();
        System.out.println("Enter the updated last name");
        String lastName = sc.next();
        System.out.println("Enter the updated address");
        String address = sc.next();
        System.out.println("Enter the updated city");
        String city = sc.next();
        System.out.println("Enter the updated state");
        String state = sc.next();
        System.out.println("Enter the updated emailID");
        String emailId = sc.next();
        System.out.println("Enter the updated zipcode");
        int zipcode = sc.nextInt();
        System.out.println("Enter the updated phoneNumber");
        long phoneNumber = sc.nextInt();
        editContacts(searchName, firstName, lastName, address, city, state, emailId, zipcode, phoneNumber);
    }


    /**
     * used to edit contacts
     *
     * @param searchName is used to edit contacts
     */
    public ArrayList<Contacts> editContacts(String searchName, String firstName, String lastName, String address, String city, String state, String emailId, int zipcode, long phoneNumber) {

        for (Contacts contact : contact_Details) {
            if (searchName.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts");
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setEmailId(emailId);
                contact.setZipCode(zipcode);
                contact.setPhoneNumber(phoneNumber);
            }
        }
        return contact_Details;
    }


    /**
     * deleteContact is used to delete
     *
     * @param name is used to delete the contact based upon names
     */
    public ArrayList<Contacts> deleteContact(String name) {
        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts, deleting contact");
                contact_Details.remove(contact);
            } else
                System.out.println("Entered name not found in the AddressBook");
        }
        return contact_Details;
    }

    /**
     * showContacts is used to display contacts
     */
    public ArrayList<Contacts> showContacts() {
        int i = 1;
        for (Contacts contact : contact_Details) {
            System.out.println("Details  of contact number " + i + " is");
            System.out.println(contact.toString());
            i++;
        }
        return contact_Details;
    }

}
