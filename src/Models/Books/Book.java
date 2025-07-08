package Models.Books;

import Models.Product;

import java.time.Year;

public abstract class Book extends Product {
    private String ISBN;
    private String Title;
    private Year YearPublished;
    //private double Price;

    public Book(String ISBN, String title, Year yearPublished, double price) {
        this.ISBN = ISBN;
        Title = title;
        YearPublished = yearPublished;
        setPrice(price);
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public Year getYearPublished() {
        return YearPublished;
    }

    public Book() {

    }


}
