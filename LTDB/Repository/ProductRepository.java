package LTDB.Repository;

import LTDB.Model.Product;
import LTDB.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductRepository {

    public ArrayList<Product> getAllProducts() {

        ArrayList<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM Product";

        try {
            Connection connection = DatabaseConnection.getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Product product = new Product();

                product.setProduct_id(
                        resultSet.getInt("product_id")
                );

                product.setProduct_name(
                        resultSet.getString("product_name")
                );

                product.setProduct_purchase_price(
                        resultSet.getInt("product_purchase_price")
                );

                product.setProduct_selling_price(
                        resultSet.getInt("product_selling_price")
                );

                product.setProduct_stock_quantity(
                        resultSet.getInt("product_stock_quantity")
                );

                products.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}