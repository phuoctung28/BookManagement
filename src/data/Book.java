package data;

public class Book {

    protected String bookName;
    protected String ID;
    protected double price;
    protected String author;

    public Book(String bookName, String ID, double price, String author) {
        this.bookName = bookName;
        this.ID = ID;
        this.price = price;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("|%-30s|%10s|%-5.1f|%10s|\n", bookName, ID, price, author);
    }

    public void showProfile() {
        System.out.printf("%-30s %-10s %-10.1f %-20s\n", bookName, ID, price, author);
    }
}
