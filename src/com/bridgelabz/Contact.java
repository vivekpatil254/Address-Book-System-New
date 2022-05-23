package com.bridgelabz;

import java.util.Scanner;

public class Contact {
    String firstName,state,lastName,address,city,email;
    long zip,phoneNumber,addressBookIndex;
     public void getdata()
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name     :    ");
        firstName=scanner.nextLine();
        System.out.println("Enter last name     :    ");
        lastName=scanner.nextLine();
        System.out.println("Enter address       :    ");
        address=scanner.nextLine();
        System.out.println("Enter city          :    ");
        city=scanner.nextLine();
        System.out.println("Enter state         :    ");
        state=scanner.nextLine();
        System.out.println("Enter E-mail        :    ");
        email=scanner.nextLine();
        System.out.println("Enter zip code      :    ");
        zip=scanner.nextLong();
        System.out.println("Enter contact number:    ");
        phoneNumber=scanner.nextLong();
        }

        public void display()

           {
              System.out.println("\n\n\n");
              System.out.println("First name          :    "+firstName);
              System.out.println("Last name           :    "+lastName);
              System.out.println("Address             :    "+address);
              System.out.println("City                :    "+city);
              System.out.println("State               :    "+state);
              System.out.println("E-mail Id           :    "+email);
              System.out.println("Zip code            :    "+zip);
              System.out.println("Contact Number      :    "+phoneNumber);
           }
           public boolean search(String name)
           {
               if(this.firstName.equalsIgnoreCase(name))
                  return true;
               else
                  return false;
           }



}
