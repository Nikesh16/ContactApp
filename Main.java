package com.company;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts myContact = new Contacts();
    public static void main(String[] args) {
            int options = 0;
            boolean quit = false;
            printInstructions();
            while ( !quit){
                System.out.println("Enter your options: ");
                options = scanner.nextInt();
                scanner.nextLine();
                switch (options){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        printList();
                        break;
                    case 2:
                        addContact();
                        break;
                    case 3:
                        removeContact();
                        break;
                    case 4:
                        findContact();
                        break;
                    case 5:
                        quit = true;
                        break;
                }
            }
        }
        public static void printInstructions(){
            System.out.println("\n Press 0 for Printing the instructions ");
            System.out.println("\t Press 1 for Printing the list of contacts ");
            System.out.println("\t Press 2 for adding the instructions ");
            System.out.println("\t Press 3 for removing  the instructions ");
            System.out.println("\t Press 4 for finding the instructions ");
            System.out.println("\t Press 5 for quit ");
        }
        public static void printList(){
            System.out.println("In this menu, you can find all the contact list, press 1 to continue the process!");
            myContact.printContact(scanner.nextInt());
    }
        public static void addContact(){
            System.out.println(" Here, I will add contact to our database");
            myContact.addContact(scanner.nextLine());

        }
        public static void removeContact(){
            System.out.println("This option allows you to remove item from our dataBase. " +
                    "Enter the name which you want to remove: ");
            myContact.removeContact(scanner.nextLine());
    }
        public static void findContact(){
            System.out.println(" I am here to help you find contact. ");
            System.out.println(" please type the name and i will inform you if it's available or not in our data: ");
            myContact.queryContact(scanner.nextLine());
    }





 }


