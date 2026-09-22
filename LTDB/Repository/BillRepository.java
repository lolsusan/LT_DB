package LTDB.Repository;

import LTDB.Database.DatabaseConnection;
import LTDB.Model.Bill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BillRepository {

    public ArrayList<Bill> getAllBills() {

        ArrayList<Bill> Bills = new ArrayList<>();

        String sql = "select\n" +
                "\tb.bill_id,\n" +
                "    b.customer_id,\n" +
                "    b.date ,\n" +
                "    c.customer_name\n" +
                "    from bill b\n" +
                "    join customer c\n" +
                "    on b.customer_id = c.customer_id\n" +
                "ORDER BY b.bill_id;";


        try {
            Connection connection = DatabaseConnection.getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Bill Bill = new Bill();

                Bill.setBill_id(
                        resultSet.getInt("Bill_id")
                );

                Bill.setCustomer_id(
                        resultSet.getInt("customer_id")
                );

                Bill.setCustomer_name(
                        resultSet.getNString("customer_name")
                );

                Bill.setDate(
                        resultSet.getString("date")
                );

                Bills.add(Bill);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Bills;
    }
}