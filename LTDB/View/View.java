package LTDB.View;

import LTDB.Model.Product;
import LTDB.Repository.ProductRepository;

import java.util.ArrayList;

public class View {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        ArrayList<Product> products = repository.getAllProducts();

        System.out.println("========== PRODUCT LIST ==========");

        for (Product product : products) {

            System.out.println(
                    "ID: " + product.getProduct_id()
            );

            System.out.println(
                    "Name: " + product.getProduct_name()
            );

            System.out.println(
                    "Purchase Price: "
                            + product.getProduct_purchase_price()
            );

            System.out.println(
                    "Selling Price: "
                            + product.getProduct_selling_price()
            );

            System.out.println(
                    "Stock Quantity: "
                            + product.getProduct_stock_quantity()
            );

            System.out.println("----------------------------------");
        }
    }
}