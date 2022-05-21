package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    String addressBookName;
    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }



    static Scanner scanner = new Scanner(System.in);

    List<Contacts> contactsArrayList = new ArrayList<>();

    public void addContact() {
        Contacts contacts = new Contacts();

        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        contacts.setFirstName(firstName);

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        contacts.setLastName(lastName);

        System.out.println("Enter Email:");
        String email = scanner.next();
        contacts.setEmail(email);

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.next();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter Zip Code:");
        String zip = scanner.next();
        contacts.setZip(zip);

        System.out.println("Enter City:");
        String city = scanner.next();
        contacts.setCity(city);

        System.out.println("Enter State:");
        String state = scanner.next();
        contacts.setState(state);

        System.out.println("Enter Address:");
        String address = scanner.next();
        contacts.setAddress(address);

        contactsArrayList.add(contacts);
    }
    public void editContact() {
        System.out.println("Edit contact of First Name:");
        String firstName = scanner.next();

        for(Contacts contact:contactsArrayList){

            boolean isContactThere = false;
            if(firstName.equals(contact.getFirstName())){
                contact.editContact();
                System.out.println("Contact edited successfully!");
                isContactThere =false;
                break;
            }

            if(isContactThere == true){
                System.out.println("No record of contact with First Name "+firstName+" in the address book.");
            }
        }

    }

    public void deleteContact() {
        System.out.println("Delete contact of First Name:");
        String firstName = scanner.next();

        boolean isContactThere = false;

        for(Contacts contact:contactsArrayList){
            if(firstName.equals(contact.getFirstName())){

                contactsArrayList.remove(contact);
                System.out.println("Contact deleted successfully!");
                isContactThere =false;
                break;
            }

            if(isContactThere == true){
                System.out.println("No record of contact with First Name "+firstName+" in the address book.");
            }
        }

    }
}