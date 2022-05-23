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

        do {


            System.out.println("...........Address book Menu...............");
            System.out.println("1. Add new contact ");
            System.out.println("2. Display all contact from address book ");
            System.out.println("3. Edit  contact by name ");
            System.out.println("4. exit ");
            System.out.println("Enter your choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    contact.getdata();
                    addressBook.add(count, contact);
                    System.out.println(count);
                    count++;
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println("count "+count+"\n i "+i);
                         addressBook.get(i).display();
                       // contact.display();
                    }
                    break;
                case 3:
                    if(count==0)
                        System.out.println("The address book is empty ...");
                    else {
                        boolean flag = false;
                        String name;
                        System.out.println("Enter person name to edit the contact");
                        name = scanner.next();
                        for (int i = 0; i < count; i++) {
                            contact = addressBook.get(i);
                            flag = contact.search(name);
                            if (flag == true) {
                                System.out.println("the previous data for " + name);
                                contact = addressBook.get(i);
                                System.out.println("Enter new data : ");
                                contact.getdata();
                                addressBook.set(i, contact);
                                System.out.println("data edited successfully...");
                                break;
                            }
                            if (flag == false)
                                System.out.println("the person data is not avaialable for entered name...");
                        }
                    }
                case 4 :
                    System.exit(0);
            }
        }while(true);
    }
}
