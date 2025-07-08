package Models;

public class Product {
    // this class to identify object if its product so it can be  bought or not
    // any class enhirt from it will make it a product that customer /Employee make changes and Take action on it into
    private double Price;
    public void setPrice(double price)
    {
        this.Price=price;
    }
    public double getPrice()
    {
        return Price;
    }
}
