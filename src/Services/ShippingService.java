package Services;

import Interfaces.IShippable;
import Models.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ShippingService {
    public static void Ship(IShippable product, String address)
    {
        if(Objects.isNull(product))throw new RuntimeException("Please Provide a list");

        System.out.println(product.toString());

        System.out.println("The Products you bought is Shipped\nIt will be sent to the following address: "+address);


    }
}
