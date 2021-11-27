package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("Enter 1 to add \nEnter 2 to edit \nEnter3 to delete");
            switch (sc.nextInt()) {
                case 1:
                    addressBook.addContacts();
                    break;
                case 2:
                    System.out.println("Enter the contact name to edit");
                    addressBook.editContacts(sc.next());
                    break;
                case 3:
                    System.out.println("Enter the contact name to delete");
                    addressBook.deleteContact(sc.next());
                    break;
                case 4:
                    addressBook.showContacts();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
