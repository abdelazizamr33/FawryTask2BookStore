package Services;

import Interfaces.IDigitable;
import Models.Product;

import java.util.List;
import java.util.Objects;

import static Utilities.Utilities.EmailRegex;

public class EmailService {
    public static void SendEmail(IDigitable digitalProduct, String CustomerEmail,String CompanyEmail) {

        if(Objects.isNull(CustomerEmail)||Objects.isNull(CompanyEmail)) throw new RuntimeException("Please add valid Email");
        if(!(EmailRegex(CompanyEmail)&&EmailRegex(CustomerEmail)))throw new RuntimeException("Please add valid Email");

        System.out.println("\n\n====================== Email ======================\n\n");
        System.out.println("Subject: Sending Product");
        System.out.println("From: "+CompanyEmail);
        System.out.println("To: "+CustomerEmail);
        System.out.println("\nDear Customer");
        System.out.println("Hope This Email Finds you well,");
        System.out.println("We are happy for buying from us\nand we are glad to send you your digital " + digitalProduct.getClass().getTypeName() + " Product \n" + digitalProduct.toString());
        System.out.println("Thank you From Buying from us\nBest Regards,\nCompany\n\n");
    }

}
