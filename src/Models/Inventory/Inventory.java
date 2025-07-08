package Models.Inventory;

import Models.Books.Book;
import Models.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static List<Product> Inventory=new ArrayList<>();

    public static List<Product> getInventory()
    {
        return Inventory;
    }

    public static Product findProduct(String ISBN) {
        if (ISBN == null || ISBN.isEmpty()) return null;

        for (Product product : Inventory) {
            if (product instanceof Book book) {
                if (book.getISBN().equals(ISBN)) {
                    return book;
                }
            }
        }
        return null;
    }

    public static boolean findInInventoryByISBN(String ISBN) {
        for (Product product : Inventory) {
            if (product instanceof Book book) {
                if (book.getISBN().equals(ISBN)) {
                    return true;
                }
            }
        }
        return false;
    }



}
