package Models.Books;

import Interfaces.IDigitable;
import Models.FileType;

import java.time.Year;

public class Ebook extends Book implements IDigitable {
    private FileType BookFileType;
    // Emial Send

    public FileType getBookFileType() {
        return BookFileType;
    }

    public Ebook(String ISBN, String title, Year yearPublished, double price, FileType bookFileType) {
        super(ISBN, title, yearPublished, price);
        BookFileType = bookFileType;
    }
    @Override
    public String toString() {
        return "\nBook Title: "+getTitle()+"\nPublished in Year: "+getYearPublished()+"\nPrice: "+getPrice()+"\nBook Format: "+getBookFileType()+"\n";
    }

}
