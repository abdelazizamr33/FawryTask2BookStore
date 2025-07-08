import Models.Books.Ebook;
import Models.Books.PaperBook;
import Models.FileType;
import Models.Inventory.Inventory;
import Models.Product;
import Models.Users.Employee;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Test.TestAddBook(); // test to add books methods
        Test.TestRemoveOutDatedBooks(); // test to remove books before 15 years
        Test.BuyBook(); // test to customer buy book ebook and paper one


    }
}