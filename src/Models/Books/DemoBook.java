package Models.Books;

import Interfaces.INotForSale;

import java.time.Year;

public class DemoBook extends Book implements INotForSale {
    @Override
    public String toString() {
        return "\nBook Title: "+getTitle()+"\nPublished in Year: "+getYearPublished()+"\nNot For Sale!!\n";
    }

    public DemoBook(String ISBN, String title, Year yearPublished) {
        super(ISBN, title, yearPublished, 0);
    }
}
