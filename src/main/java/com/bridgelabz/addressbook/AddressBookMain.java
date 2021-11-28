package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Scanner;


public class AddressBookMain {
    static HashMap<String, AddressBook> addressBooks = new HashMap<>();
    public static void main(String[] args) {
        AddressBook book1 = new AddressBook();
        AddressBook book2 = new AddressBook();
        AddressBook book3 = new AddressBook();
        addressBooks.put("AddressBook1", book1);
        addressBooks.put("AddressBook2", book2);
        addressBooks.put("AddressBook3", book3);
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("Enter 1 to add \nEnter 2 to edit \nEnter3 to delete");
            switch (sc.nextInt()) {
                case 1:
                    addressBook.setAddContacts();
                    break;
                case 2:
                    System.out.println("Enter the contact name to edit");
                    addressBook.edit(sc.next());
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
