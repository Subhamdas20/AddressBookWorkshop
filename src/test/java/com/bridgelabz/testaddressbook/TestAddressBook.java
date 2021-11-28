package com.bridgelabz.testaddressbook;

import com.bridgelabz.addressbook.AddressBook;
import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.Contacts;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestAddressBook {

    @Test
    public void givenAddMethodWhenContactsAddedShouldReturnTheList() {
        AddressBook book = new AddressBook();
        ArrayList<Contacts> contact = book.addContacts("Subham", "das", "sukantapally", "durgapur", "bengal", "subham@gmail", 713207, 70033213);
        ArrayList<Contacts> contacts = book.addContacts("Subham", "das", "sukantapally", "durgapur", "bengal", "subham@gmail", 713207, 70033213);
        Assert.assertEquals(1,contacts.size());
    }

    @Test
    public void givenEditMethodWhenContactsEditedShouldReturnTheList() {
        AddressBook book = new AddressBook();
        ArrayList<Contacts> contacts = book.addContacts("Avishek", "paul", "sukantanagar", "kolkata", "bengal", "avishek_paul@gmail", 719867, 6438452);
        ArrayList<Contacts> edit = book.editContacts("Avishek","Angel","Priya","ABC Nagar","Kolata","bengal","priya@gmail",54681,99657398);
        ArrayList<Contacts> show = book.showContacts();
        Assert.assertEquals(show,edit);

    }
    @Test
    public void givenDeleteMethodWhenContactsDeletedShouldReturnTheList() {
        AddressBook book = new AddressBook();
        ArrayList<Contacts> contacts = book.addContacts("Avishek", "paul", "sukantanagar", "kolkata", "bengal", "avishek_paul@gmail", 719867, 6438452);
        ArrayList<Contacts> contact = book.addContacts("Subham", "das", "sukantapally", "durgapur", "bengal", "subham@gmail", 713207, 70033213);
        ArrayList<Contacts> delete = book.deleteContact("Avishek");
        Assert.assertEquals(1,delete.size());
    }
    @Test
    public void givenAddMethodWhenMultipleContactsAddedShouldReturnTheList() {
        AddressBook book = new AddressBook();
        ArrayList<Contacts> contact = book.addContacts("Subham", "das", "sukantapally", "durgapur", "bengal", "subham@gmail", 713207, 70033213);
        ArrayList<Contacts> contacts = book.addContacts("Avishek", "paul", "sukantanagar", "kolkata", "bengal", "avishek_paul@gmail", 719867, 6438452);        Assert.assertEquals(2,contacts.size());
        Assert.assertEquals(2,contacts.size());
    }
    @Test
    public void givenAddMethodWhenDuplicateContactsAddedShouldReturnTheListWithNoDuplicateEntry() {
        AddressBook book = new AddressBook();
        ArrayList<Contacts> contact = book.addContacts("Subham", "das", "sukantapally", "durgapur", "bengal", "subham@gmail", 713207, 70033213);
        ArrayList<Contacts> contacts = book.addContacts("Subham", "das", "sukantapally", "durgapur", "bengal", "subham@gmail", 713207, 70033213);
        ArrayList<Contacts> contact2 = book.addContacts("Avishek", "paul", "sukantanagar", "kolkata", "bengal", "avishek_paul@gmail", 719867, 6438452);
        Assert.assertEquals(2,contacts.size());
    }


}
