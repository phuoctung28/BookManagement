package javaapplication12;

import data.Shelf;
import java.util.Scanner;

public class JavaApplication12 {

    public static void printMenu() {
        System.out.println("1. Add a new book: ");
        System.out.println("2. Print book list: ");
        System.out.println("3. Find book by name: ");
        System.out.println("4. Sort book by name: ");
        System.out.println("5. Exit: ");
    }

    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        Scanner sc = new Scanner(System.in);
        String options;
        do {
            printMenu();
            System.out.print("Input your choice 1..5!: ");
            options = sc.nextLine();
            switch (options.charAt(0)) {
                case '1':
                    shelf.addABook();
                    break;
                case '2':
                    shelf.printBookList();
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                default:
                    System.out.println("Please choose from 1 to 5!!!!");
            }
        } while (options.charAt(0) != '5');

    }
}
