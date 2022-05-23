package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ...");
        Contact contact =new Contact();
        int choice,count=0;
        List<Contact> addressBook = new ArrayList<>();

        System.out.println("...........Address book Menu...............");
        System.out.println("1. Add new contact ");
        System.out.println("2. Display all contact from address book ");
        System.out.println("Enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        choice=scanner.nextInt();
        switch(choice) {
            case 1 :
                contact.getdata();
                addressBook.add(count,contact);
                count++;
                break;
            case 2 :
                for (int i=0;i<count;i++){
                contact = addressBook.get(i);
                contact.display();
                break;
        }

    }
}
