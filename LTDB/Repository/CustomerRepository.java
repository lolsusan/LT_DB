package LTDB.Repository;

import LTDB.Database.DatabaseConnection;
import LTDB.Model.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerRepository {

    public ArrayList<Customer> getAllCustomers() {

        ArrayList<Customer> Customers = new ArrayList<>();

        String sql = "SELECT * FROM Customer";


        try {
            Connection connection = DatabaseConnection.getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Customer Customer = new Customer();

                Customer.setCustomer_id(
                        resultSet.getInt("Customer_id")
                );

                Customer.setCustomer_name(
                        resultSet.getString("Customer_name")
                );

                Customer.setCustomer_phone_num(
                        resultSet.getString("Customer_phone_num")
                );

                Customers.add(Customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Customers;
    }
}