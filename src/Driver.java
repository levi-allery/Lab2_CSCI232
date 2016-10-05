/**
 * Levi Allery
 * CSCI 232
 * GID -02246666
 */

import java.util.Scanner;

public class Driver {
    public Driver() {
        menu();
    }

    public static void main(String args[]) {
        Driver d = new Driver();

    }

    public void menu() {
        //Variables
        Scanner scn = new Scanner(System.in);
        int arraySize = 0;
        int items;
        boolean done = false;
        boolean tableCreated = false;

        while(!tableCreated) {
            System.out.println("Enter size of has table: ");
            arraySize = scn.nextInt();
            if (arraySize <= 0) {
                System.out.println("Please enter something greater then zero");
            }
            else{
                tableCreated = true;
            }
        }
        HashTable h = new HashTable(arraySize);
        System.out.println("Enter initial number of items: ");
        items = scn.nextInt();
        for (int i = 0; i < items; i++) {
            h.insert(i*i^2);
        }
        while (!done) {
            System.out.println("Enter first letter of show, insert, find, or exit: ");
            String selection = scn.next();
            switch (selection) {
                case "s"://Shows the table along with binary tree in array location
                    h.show();
                    break;
                case "i"://Inserts into hash table
                    System.out.println("Enter key value to insert: ");
                    h.insert(scn.nextInt());
                    break;
                case "f"://Finds an int within the table
                    System.out.println("Enter key value to find: ");
                    h.find(scn.nextInt());
                    break;
                case "e": //Exits program
                    done = true;
                    break;
                default:
                    System.out.println("Please enter either 's', 'i', or 'f' \n");
            }
        }
    }
}

