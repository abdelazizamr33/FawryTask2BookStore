package Utilities;

import Models.Inventory.Inventory;
import Models.Product;

import java.util.regex.Pattern;

public class Utilities {
    public static boolean EmailRegex(String email)
    {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValid = Pattern.matches(emailRegex, email);
        return isValid == true;
    }

    public static void PrintInventory()
    {
        for(Product p: Inventory.getInventory())
        {
            System.out.println(p.toString());
        }
    }
}
