package javaapplication12;

import data.Shelf;

public class JavaApplication12 {

    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        System.out.println("Book List after sorting by price: ");
        shelf.showBookList();
        System.out.println("\n");
        System.out.println("Book List before sorting by price: ");
        shelf.sortByPrice();

    }
}
