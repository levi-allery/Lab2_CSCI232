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
        HashTable h = new HashTable(10);
        h.insert(10);
        h.insert(2);
        h.insert(20);
        h.insert(32);
        h.show();
        h.find(431);

//
//        Scanner scn = new Scanner(System.in);
//        int arraySize = 0;
//        int items = 0;
//        System.out.println("Enter size of has table: ");
//        arraySize = scn.nextInt();
//        System.out.println("Enter initial number of item: ");
//        items = scn.nextInt();
//        System.out.println("Enter first letter of show, insert, or find: ");
//        String selection = scn.next();
//        switch (selection) {
//            case s://Shows the table along with binary tree in array location
//                break;
//            case i://Inserts into hash table
//                break;
//            case f://Finds an int within the table
//                break;
//            default:
//                System.out.println("Please enter either 's', 'i', or 'f' \n");
//        }
    }
}
