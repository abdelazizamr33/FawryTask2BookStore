package Models.Users;

import Interfaces.IDigitable;
import Interfaces.INotForSale;
import Interfaces.IShippable;
import Models.Books.PaperBook;
import Models.Inventory.Inventory;
import Models.Product;

import java.util.Objects;

import static Services.EmailService.SendEmail;
import static Services.ShippingService.Ship;

public class Customer {
    private String Address;
    private String Email;
    private double Balance;

    public Customer(String address, String email, double balance) {
        Address = address;
        Email = email;
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public double Buy(String ISBN,int Quantity)
    {
        Product product=Inventory.findProduct(ISBN);
        if(Objects.isNull(product))throw new RuntimeException("Product Not Found In Inventory");
        double ProductPrice=product.getPrice();
        if(getBalance()<ProductPrice)throw new RuntimeException("Not Enough balance");
        if(product instanceof PaperBook)
        {
            if(((PaperBook) product).getQuantity()<Quantity)throw new RuntimeException("Not Enough in Stock");
        }
        if(product instanceof IShippable shippable)
        {
            shippable.reduceQunatity(Quantity);
            Ship(shippable,Address);
        }
        else if(product instanceof IDigitable digitable)
        {
            SendEmail(digitable,Email,"company@gmail.com");
        }
        else if(product instanceof INotForSale)
        {
            throw new RuntimeException("This Product is not for Sale");
        }
        return ProductPrice*Quantity;
    }
}
