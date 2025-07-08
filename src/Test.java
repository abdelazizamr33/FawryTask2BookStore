import Models.Books.DemoBook;
import Models.Books.Ebook;
import Models.Books.PaperBook;
import Models.FileType;
import Models.Inventory.Inventory;
import Models.Product;
import Models.Users.Customer;
import Models.Users.Employee;

import java.time.Year;

import static Utilities.Utilities.PrintInventory;

public class Test {

    // Note I had made this file as the pdf said to provide class test to test each featre of program


    static Employee employee1=new Employee();
    static Employee employee2=new Employee();
    static Employee employee3=new Employee();

    static Customer customer1=new Customer("Cairo Street","customer1@gmail.com",276.9);

    static Ebook ebook1=new Ebook("11","Good 7 Habbits", Year.of(2000),55.5, FileType.Pdf);
    static PaperBook paperBook1=new PaperBook("33","Harry Potter", Year.of(1998),125,10);
    static DemoBook demoBook1=new DemoBook("25","ToyStory", Year.of(2010));


    public static void TestAddBook()
    {
        System.out.println("Test Case 1 : Adding Products to Inventory throgh multiple employees\n");
        employee1.AddProduct(ebook1);
        employee2.AddProduct(paperBook1);
        employee3.AddProduct(demoBook1);

        PrintInventory();
    }

    public static void TestRemoveOutDatedBooks()
    {
        System.out.println("Test 2 Remove all books that passed 15 years");
        employee1.RemoveOutDatedBooks(15);
        PrintInventory();
    }

    public static void BuyBook()
    {
        employee1.AddProduct(ebook1);
        employee2.AddProduct(paperBook1);

        System.out.println("Test3 customer buy  book\nInventory Before");
        PrintInventory();
        customer1.Buy("11",2); // buy digital book
        customer1.Buy("33",2); // buy paper book


        System.out.println("\nInventory After buying\n");
        PrintInventory();
    }
}
