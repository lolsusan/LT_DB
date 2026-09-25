package LTDB.View;

import LTDB.DTO.BillDetail;
import LTDB.Repository.BillRepository2;

import java.util.ArrayList;

public class BillCaculator {
    public static void main(String[] args) {

        BillRepository2 repository = new BillRepository2();

        ArrayList<BillDetail> Bills = repository.getAllBills();

        System.out.println("========== Bill LIST ==========");

        for (BillDetail Bill : Bills) {

            System.out.println(
                    "ID: " + Bill.getBillId()
            );

            System.out.println(
                    "Date: " + Bill.getDate()
            );

            System.out.println(
                    "Customer Name: " + Bill.getCustomerName()
            );

            System.out.println(
                    "Product Name: " + Bill.getProductName()
            );

            System.out.println(
                    "Product Selling Price: " + Bill.getProductSellingPrice()
            );

            System.out.println(
                    "Product quantity: " + Bill.getQuantity()
            );

            System.out.println(
                    "Discount " + Bill.getDiscount()
            );

            System.out.println(
                    "Total Price " + (Bill.getProductSellingPrice() * Bill.getQuantity() * ( 1 - Bill.getDiscount()) )
            );

            System.out.println("----------------------------------");
        }
    }
}
