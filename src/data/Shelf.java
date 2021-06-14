package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelf {

    private ArrayList<Book> bookList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addABook() {
        String bookName;
        String ID;
        double price;
        String author;
        String choice;
        do {
            System.out.println("Enter Book's name: ");
            bookName = sc.nextLine();
            System.out.println("Enter Book's ID: ");
            ID = sc.nextLine();
            System.out.println("Enter price: ");
            price = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Book's author: ");
            author = sc.nextLine();
            bookList.add(new Book(bookName, ID, price, author));

            System.out.print("Do you want to add a new book: (Y/N) ? ");
            choice = sc.nextLine();
        } while (choice.toUpperCase().charAt(0) != 'N');

    }

    public void printBookList() {
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).showProfile();
        }
    }
}
