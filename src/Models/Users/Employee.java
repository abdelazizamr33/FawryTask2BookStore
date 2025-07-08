package Models.Users;

import Models.Books.Book;
import Models.Inventory.Inventory;
import Models.Product;

import java.time.Year;
import java.util.Objects;

public class Employee {
    public void AddProduct(Product product)
    {
        if(Objects.isNull(product)) throw new RuntimeException("Please add a product");
        Inventory.getInventory().add(product);
    }
    public void RemoveOutDatedBooks(int passedYears) {
        if (Inventory.getInventory().isEmpty()) {
            throw new RuntimeException("Empty Inventory Please add some products");
        }
        Year yearLimit = Year.now().minusYears(passedYears);
        Inventory.getInventory().removeIf(product ->
                product instanceof Book book &&
                        book.getYearPublished().isBefore(yearLimit)
        );
    }



}
