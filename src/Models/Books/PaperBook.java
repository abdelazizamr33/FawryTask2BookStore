package Models.Books;

import Interfaces.IShippable;
import Models.FileType;

import java.time.Year;

public class PaperBook extends Book implements IShippable {
    private int Stock;

    public PaperBook(String ISBN, String title, Year yearPublished, double price, int Stock) {
        super(ISBN, title, yearPublished, price);
        this.Stock = Stock;
    }

    @Override
    public int getQuantity() {
        return Stock;
    }



    @Override
    public void reduceQunatity(int Quantity) {
        if(getQuantity()<1)throw new RuntimeException("Out Of Stock");
        Stock-=Quantity;
    }

    @Override
    public String getName() {
        return getTitle();
    }

    @Override
    public String toString() {
        return "\nBook Title: "+getTitle()+"\nPublished in Year: "+getYearPublished()+"\nPrice: "+getPrice()+"\nQuantity in stock: "+getQuantity()+"\n";
    }
}
