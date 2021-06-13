package data;

public class Shelf {

    private Book[] bookList = new Book[]{
        new Book("To Kill a Mockingbird", "A6868", 128000, "Harper Lee"),
        new Book("Pride and Prejudice", "B7213", 321000, "Jane Austen"),
        new Book("1984", "G7231", 245000, "George Orwell"),
        new Book("The Great Gatsby", "H7712", 451000, "F. Scott Fitzgerald"),
        new Book("The Hobbit", "K8812", 377421, "J.R.R. Tolkien"),};

    public void sortByPrice() {
        for (int i = 0; i < bookList.length - 1; i++) {
            for (int j = i + 1; j < bookList.length; j++) {
                if (bookList[i].getPrice() > bookList[j].getPrice()) {
                    Book t = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = t;
                }
            }
        }
        for (int i = 0; i < bookList.length; i++) {
            bookList[i].showProfile();
        }
    }

    public void showBookList() {
        for (int i = 0; i < bookList.length; i++) {
            bookList[i].showProfile();
        }
    }
}
